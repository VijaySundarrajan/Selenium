package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertPopUpHandling {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. main alert
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		
//		Alert alert =driver.switchTo().alert();
//		
//		String text=alert.getText();
//		
//		System.out.println(text);
//		
//		alert.accept();
		
		//alert.dismiss();  -- dismiss
		
		//2.confirm
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert=driver.switchTo().alert();
//		
//		String text=alert.getText();
//		
//		System.out.println(text);
//		
//		//alert.accept();
//		alert.dismiss();
		
		//3.JS prompt:
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert alert =driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		
		alert.sendKeys("Vijayy");
		alert.accept();
		
		
		
		
		
		
		
	}

}
