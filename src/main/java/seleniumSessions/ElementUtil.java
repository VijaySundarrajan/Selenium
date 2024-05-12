package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	private void nullBlankCheck(String value) {
		if (value == null || value.length() == 0) {
			throw new MyElementException(value + " --- value text cannot be null");
		}
	}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;

		switch (locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssselector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;
		default:
			break;
		}
		return locator;
	}

	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not present on the page");
			e.printStackTrace();
			return null;
		}
		return element;
	}

	public void doSendKeys(By locator, String value) {
		nullBlankCheck(value);
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();

	}

	public String doElementGetAttribute(By locator, String attrname) {
		return getElement(locator).getAttribute(attrname);
	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean isElementExist(By locator) {
		if (getElements(locator).size() == 1) {
			return true;
		}
		return false;
	}

	public boolean multipleElementExist(By locator) {
		if (getElements(locator).size() > 0) {
			return true;
		}
		return false;
	}

	public boolean multipleElementExist(By locator, int elementCount) {
		if (getElements(locator).size() == elementCount) {
			return true;
		}
		return false;
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementsCount(By locator) {
		return driver.findElements(locator).size();
	}

	public ArrayList<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {

			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
				// System.out.println(text);
			}

		}

		return eleTextList;
	}

	public ArrayList<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttrList = new ArrayList<String>();
		for (WebElement e : eleList) {

			String attrValue = e.getAttribute(attrName);
			if (attrValue.length() != 0) {
				eleAttrList.add(attrValue);
			}

		}
		return eleAttrList;
	}

	// **********************SelectBased DropDown Utils******************//

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectByVisibleText(By locator, String visibleText) {
		nullBlankCheck(visibleText);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public void doSelectByValue(By locator, String value) {
		nullBlankCheck(value);
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public List<WebElement> getDropDownOptionsList(By locator) {

		Select select = new Select(getElement(locator));
		return select.getOptions();
	}

	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String optionText = e.getText();
			optionsTextList.add(optionText);

		}
		return optionsTextList;

	}

	public int getDropDownValuesCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}

	public void doSelectDropDownValue(By locator, String value) {

		nullBlankCheck(value);

		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}

	public void printSelectDropDownValue(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);

		}
	}

	// without select class, select the drop down value
	public void DoSelectValueFromDropDown(By locator, String value) {
		nullBlankCheck(value);
		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public void doSearch(By locator, By searchSuggestions, String searchKey, String value) throws InterruptedException {
		// driver.findElement(locator).sendKeys(searchKey);
		doSendKeys(locator, searchKey);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(searchSuggestions);

		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			// System.out.println(text);
			// Thread.sleep(2000);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

	/********************************* Actions Utils *****************************/

	public void handleMenuSubmenuLevel2(By parentMenu, By subMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		doClick(subMenu);
	}

	public void handleMenuSubmenuLevel4(By level1Menu, By leve12Menu, By level3Menu, By level4Menu)
			throws InterruptedException {
		doClick(level1Menu);
		Thread.sleep(1500);
		Actions act = new Actions(driver);

		act.moveToElement(getElement(leve12Menu)).perform();
		Thread.sleep(1500);
		act.moveToElement(getElement(level3Menu)).perform();
		Thread.sleep(1500);

		doClick(level4Menu);
	}

}
