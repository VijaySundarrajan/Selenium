package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	 
	static WebDriver driver;
	
	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//1.
//		
//		driver.findElement(By.id("input-email")).sendKeys("User123@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("user@1111");
		//Done
		
		//2
		
//		WebElement emailId=driver.findElement(By.id("input-email"));
//		WebElement pwd= driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("User123@gmail.com");
//		pwd.sendKeys("user@1111");
		//Done
		
		//3.By locator
		
//		By userName= By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		WebElement emailId=driver.findElement(userName);
//		WebElement passwd= driver.findElement(pwd);
//		
//		emailId.sendKeys("User123@gmail.com");
//		passwd.sendKeys("user@1111");
		//Done
		
		//4.By locator with some utill
//		By userName= By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		WebElement emailId= getElement(userName);
//		WebElement passwd= getElement(pwd);
//		
//		emailId.sendKeys("Vijayvj@gmail.com");
//		passwd.sendKeys("vijayud"); //Done
		
		
		//5.by locator with element and action util
		
//		By uName=By.id("input-email");
//		By pd=By.id("input-password");
//		
//		
//		doSendKeys(uName, "Arjuna@gmail.com");
//		doSendKeys(pd, "Alluarjun111"); 
		//Done
	
		//6.By locator & common util class for elements
//		By uName=By.id("input-email");
//		By pd=By.id("input-password");
//		
//		ElementUtil eleUtil =new  ElementUtil(driver);
//		eleUtil.doSendKeys(uName, "Arjuna@gmail.com");
//		eleUtil.doSendKeys(pd, "Alluarjun111");
		//Done
		
		//7. Browser util + element util
		
		
		//8.By util +String locator
//		String userName_id="input-email";
//		String pwd_id= "input-password";
//		
//		ElementUtil eleUtil =new  ElementUtil(driver);
//		eleUtil.doSendKeys("id", userName_id, "VjSundarRajan@gmail.com");
//		eleUtil.doSendKeys("id", pwd_id, "Vijaysund123");
		
		String User_id = "email";
		String pwd_id ="pass";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", User_id, "Vijay345@gmail.com");
		eleUtil.doSendKeys("id", pwd_id, "herohonda");
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String key) {
		getElement(locator).sendKeys(key);
	}
	
	
	
	
	
	
	
	
	
	

}
