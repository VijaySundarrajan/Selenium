package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
 static WebDriver driver;

	public static void main(String[] args) {
		// text -- getText()
		//Attribute -- getAttribute()
		
		driver = new ChromeDriver();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		
//		String fn=driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(fn);
		
		By fn =By.id("input-firstname");
		
		
		String fName=doElementGetAttribute(fn, "class");
		System.out.println(fName);
		
		
		
		
		
		
	}

	public static WebElement getElement(By locator) {
	return driver.findElement(locator);	
	}
	
	public static String doElementGetAttribute(By locator, String attrname)
	{
		return getElement(locator).getAttribute(attrname);
	}	
	
	
	
	
	
	
	
}

