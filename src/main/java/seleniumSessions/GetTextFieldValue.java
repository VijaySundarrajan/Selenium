package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;
	
	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("kanndhasamy@gmail.com");
		
		String str=driver.findElement(By.id("input-email")).getAttribute("value");
		
		
		System.out.println(str);
		
	}

}
