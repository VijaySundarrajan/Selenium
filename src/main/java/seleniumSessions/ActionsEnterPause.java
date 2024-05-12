package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEnterPause {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
//**********Google search  with actions class***************
		
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("M s Dhoni");
//		Actions act = new Actions(driver);
//		Thread.sleep(1500);
//		act.sendKeys(Keys.ENTER).perform();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		Actions act = new Actions(driver);
		WebElement search=driver.findElement(By.name("search"));
		
		String text="nikon";
		
		
		char[] val=text.toCharArray();
		
		for (char c : val) {
			act.sendKeys(search, String.valueOf(c)).pause(1000).build().perform();
		}
		 
		

	}

}
