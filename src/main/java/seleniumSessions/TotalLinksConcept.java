package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static void main(String[] args) throws InterruptedException {
		// 1.TOTAL links
		// 2.print the text of each link
		// 3.avoid blank text
		// 4.broken link --

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.freshworks.com/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("total links:" + allLinks.size());

		Thread.sleep(2000);
//		for (int i = 0; i < allLinks.size(); i++) {
//			
//			String text =allLinks.get(i).getText();
//			if (text.length()!=0) {
//				System.out.println(text);
//			}
//		}

		for (WebElement e : allLinks) {
			String text = e.getText();
			if (text.length() != 0) {
				System.out.println(text);
			}

		}
		System.out.println("**********************************");
		//total text fields on the page:
		
		List <WebElement> allTextFields=driver.findElements(By.className("form-control"));
		
		System.out.println(allTextFields.size());
		
		

	}

}
