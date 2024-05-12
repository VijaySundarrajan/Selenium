package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone 15 pro");
		
		driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();		
	
		
		
		
		
		
		
		
		

	}

}
