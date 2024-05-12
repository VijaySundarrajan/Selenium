package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElem {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
	//	driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		WebElement content=driver.findElement(By.className("menulink"));
//		Actions act = new Actions(driver);
//		act.moveToElement(content).perform();
//		
//		Thread.sleep(2000);
//	
//		driver.findElement(By.linkText("SINGLE VIDEOS")).click();
	
//		By parent =By.className("menulink");
//		By sbMen=By.linkText("SINGLE VIDEOS");
//		
//		handleMenuSubmenu(parent, sbMen);
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		By fMenu=By.xpath("//div[text()='Add-ons']");
		By sMenu=By.xpath("//div[text()='Govt. Employee']");
		handleMenuSubmenuLevel2(fMenu, sMenu);
		
	}
	public static WebElement getElement(By locator){
	return driver.findElement(locator);	
	}	
	public static void handleMenuSubmenuLevel2(By parentMenu,By subMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		driver.findElement(subMenu).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
