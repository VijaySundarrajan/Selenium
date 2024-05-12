package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//TopCasting
		//Automation Steps
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String title =driver.getTitle();		
		System.out.println("Page title: " + title);
		
		
		//CheckPoint or verification or act vs expected
		
		if (title.equals("Google")) {
			System.out.println("Right title-- Pass");
		}
		else {
			System.out.println("incorrect tile--Fail");
		}
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("google")) {
			System.out.println("correct url -- Pass");
		}
		else {
			System.out.println("Incorrect url -- Fail");
		}
		driver.close();
		
		WebDriver dr = new EdgeDriver();
	}

}
