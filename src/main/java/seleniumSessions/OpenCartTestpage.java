package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTestpage {

	public static void main(String[] args) {

		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		
		BrowserUtil brUtil =new BrowserUtil();
		
		WebDriver driver =brUtil.launchBrowser("Chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title =brUtil.getPageTitle();
		System.out.println(title);
		
		By email=By.id("input-email");
		By pwd=By.id("input-password");
	
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "Jan@gmail.com");
		eleUtil.doSendKeys(pwd, "jan@123");
		
	}

}
 