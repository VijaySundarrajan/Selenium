package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {
	
	static WebDriver driver;

	public static String getRandomEmail() {
		 return "automation"+System.currentTimeMillis()+"@opencart.com";
		// return "automation"+UUID.randomUUID()+"@opencart.com";
		 
	}
	
	
	public static void main(String[] args) {

		BrowserUtil brUtil =new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn=By.id("input-firstname");
		By ln=By.id("input-lastname");
		By eMail=By.id("input-email");
		By telePh=By.id("input-telephone");
		By pwd= By.id("input-password");
		By confPwd=By.id("input-confirm");
		
		By isSubsYes=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By isSubsNo=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		
		By privPolicy =By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		
		By submit =By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
	
		
		eleUtil.doSendKeys(fn, "VijaySundar");
		eleUtil.doSendKeys(ln, "Rajan");
		eleUtil.doSendKeys(eMail, getRandomEmail());
		eleUtil.doSendKeys(telePh, "7875454875");
		eleUtil.doSendKeys(pwd, "asdgagkvkh");
		
		eleUtil.doSendKeys(confPwd, "asdgagkvkh");
		
		eleUtil.doClick(isSubsNo);
		eleUtil.doClick(privPolicy);
		
		eleUtil.doClick(submit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
