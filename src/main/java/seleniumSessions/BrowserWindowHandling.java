package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
			// FileUploadPopUp------> 7-march 
		
	 	WebDriver driver = new ChromeDriver();
	 	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 	Thread.sleep(2000);
	 	
	 	driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		//1. fetch windows ID
	 	
	 	Set <String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		
		System.out.println("parent wind id: "+parentWindowId);
		
		String ChildWindowId=it.next();
		System.out.println("Child wind id: "+ChildWindowId);
		
		
		
		//2.Switching to child window:
		Thread.sleep(2000);
		driver.switchTo().window(ChildWindowId);
		System.out.println("Child url :"+driver.getCurrentUrl());
		
		driver.close();
		Thread.sleep(2000);

		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent window url :"+driver.getCurrentUrl());

		driver.quit();
		
	}

}
