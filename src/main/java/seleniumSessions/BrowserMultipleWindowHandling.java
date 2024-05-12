package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		String parentwindowId=driver.getWindowHandle();

		
		Thread.sleep(3000);
		//handle - singular---> get current window id
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

	Set<String> handles=driver.getWindowHandles();
	Iterator<String> it=handles.iterator();
	
	//it.next();
	
	while (it.hasNext()) {
		String windowId = it.next();
		
		driver.switchTo().window(windowId);
		
		System.out.println("window url: " + driver.getCurrentUrl());
		//driver.switchTo().window(parentwindowId);
		
		if (!windowId.equals(parentwindowId)) {
			driver.close();
		}
		Thread.sleep(1500);
	}
	}

}
