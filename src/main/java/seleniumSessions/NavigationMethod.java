package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(new URL("https://www.google.com/")); 
		
		System.out.println(driver.getTitle());
		
		driver.get("https://naveenautomationlabs.com/opencart/");

		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.google.com/");

		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());

		driver.navigate().forward();

		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());
	}

}
