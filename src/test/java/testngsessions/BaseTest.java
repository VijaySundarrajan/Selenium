package testngsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumSessions.MyElementException;

public class BaseTest {

	WebDriver driver;

	@Parameters({ "url", "browser" })
	@BeforeTest
	public void setup(String url, String browserName) {

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();

			break;

		case "edge":
			driver = new EdgeDriver();

			break;

		case "firefox":
			driver = new FirefoxDriver();

			break;

		default:
			System.out.println("plz pass right browser " + browserName);
			throw new MyElementException("browser not found");

		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
