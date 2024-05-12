package seleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author vjysu
 */




public class BrowserUtil {

	WebDriver driver;
/**
 * 
 * @param browserName
 * @return
 */
	public  WebDriver launchBrowser(String browserName) {
		System.out.println("browser name: " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("plz pass the right browser " + browserName);
			throw new BrowserException("Browser not found");

		}
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			throw new BrowserException("URL is  Null");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			System.out.println("HTTP is Missing in URL");
		}
	}
	
	public void launchURL(URL url) {
		if (url == null) {
			throw new BrowserException("URL is  Null");
		}
		String appUrl = String.valueOf(url);
		if (appUrl.indexOf("http") == 0) {
			driver.navigate().to(url);
		} else {
			System.out.println("HTTP is Missing in URL");
		}
	}

	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
