package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) {
		// https://naveenautomationlabs.com/opencart/index.php?route=account/register
		
		
		BrowserUtil brUtil =new BrowserUtil();
		WebDriver driver =brUtil.launchBrowser("Chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title=brUtil.getPageTitle();
		System.out.println(title);
		
		
		
		By fName=By.id("input-firstname");
		By lName=By.id("input-lastname");
		By mailId=By.id("input-email");
		By telePh=By.id("input-telephone");
		By pwd=By.id("input-password");
		By confirmPwd=By.id("input-confirm");
		
		
		
		ElementUtil eleUtil =new ElementUtil(driver);
		
		eleUtil.doSendKeys(fName, "Vijay");
		eleUtil.doSendKeys(lName, "Sundar");
		eleUtil.doSendKeys(mailId, "vjysun@gmail.com");
		eleUtil.doSendKeys(telePh, "97872397");
		eleUtil.doSendKeys(pwd, "vijayvjy");
		eleUtil.doSendKeys(confirmPwd, "vijayvjy");

		

	}

}
