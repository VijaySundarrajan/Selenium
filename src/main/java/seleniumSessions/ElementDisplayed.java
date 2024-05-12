package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		 //driver.findElement(By.className("vijayyydcjkjc")).isDisplayed();//NS
		
		 By logo = By.className("lnXdpd");
		 
//		 if(isElementDisplayed(logo))
//		 {System.out.println("logo displayed");
//			 
//		 }
		 
		 
		 
		if( isElementExist(logo)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		 
	}

	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static boolean isElementExist(By locator) {
		if(getElements(locator).size()==1) {
			return true;
		}
		return  false;
	}
	
	
	
	
	
	
	
}
