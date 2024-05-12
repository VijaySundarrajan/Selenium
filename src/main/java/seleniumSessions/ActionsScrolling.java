package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");

		Actions act = new Actions(driver);
		
		// scroll down and up
		
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		// refresh using F5
//		Thread.sleep(1000);
//		driver.findElement(By.className("form-control")).sendKeys("giiyjhgffgf");
//		Thread.sleep(1500);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.F5).perform();
//		driver.navigate().refresh();
		
		
		//scroll to particular element:
//		act.scrollToElement(driver.findElement(By.linkText("Specials")))
//		.click(driver.findElement(By.linkText("Specials")))
//		.build().perform();
		
		
	}

}
