package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {

static WebDriver driver;
	
	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		boolean b1=driver.findElement(By.name("agreeTerms")).isDisplayed();
		System.out.println(b1);
		
		boolean b2=driver.findElement(By.name("submitButton")).isDisplayed();
		System.out.println(b2);

		boolean flag=driver.findElement(By.name("submitButton")).isEnabled();
		System.out.println(flag);
		
		boolean chk_flag=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		flag=driver.findElement(By.name("submitButton")).isEnabled();
		System.out.println(flag);
		
		chk_flag=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);
		
		
	}

}
