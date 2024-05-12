package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/finland");
		
		Thread.sleep(4000);
		
		WebElement ele =driver.findElement(By.linkText("Pori, Finland"));
		
		
		String leftEle=driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftEle);
		
		String RightEle=driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(RightEle);
		
		
		String aboveEle=driver.findElement(RelativeLocator.with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveEle);
		
		String belowEle=driver.findElement(RelativeLocator.with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowEle);
		
		//we can call with method without class name "relative" by importing this 

		//import static org.openqa.selenium.support.locators.RelativeLocator.with;
// near by  pixels limit = 50 pixels
		String nearEle=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearEle);
	}

}
