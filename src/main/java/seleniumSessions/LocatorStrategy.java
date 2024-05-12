package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {

	static WebDriver driver;
	
	
	
	public static void main(String[] args) {

		
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		//1.id
		//unique Attribute, can not be duplicate 
		
		//2.name: can be duplicate
//		driver.findElement(By.name("firstname")).sendKeys("Vijay");
//		driver.findElement(By.name("lastname")).sendKeys("SundarRajan");
		
//		String fn="firstname";
//		
//		ElementUtil eleUtil =new ElementUtil(driver);
//		//eleUtil.doSendKeys(fn, "Vjysund");
//		eleUtil.doSendKeys("name", fn, "Vijayyyy");
		
		
		//3.ClassName; Its not unique. 
		
		//4.xpath:
		
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("anushkA");
		
//		By fn =By.xpath("//*[@id=\"input-firstname\"]");
//		ElementUtil eleUtil =new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "hansi");
		
		//5.css: cascaded style sheet:
		
	//	driver.findElement(By.cssSelector(""))
		
		
		//6.linktext:
		
		//driver.findElement(By.linkText("Login")).click();
		
//		By loginLink = By.linkText("Login");
//		
//		ElementUtil eleUtil =new ElementUtil(driver);
//		
//		eleUtil.doClick(loginLink);
		
		//7. partial link text:
		
		//8.tagname: html tag:
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
