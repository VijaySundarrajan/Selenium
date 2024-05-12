package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCricInfo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/nepal-in-hong-kong-2023-24-1423435/nepal-vs-papua-new-guinea-final-1423444/full-scorecard");
		Thread.sleep(3000);
//		String wkt_tkr =
//				driver.findElement(By.xpath("(//span[text()='Hiri Hiri']/ancestor::td/following-sibling::td)[1]"))
//					.getText();
//		
//		System.out.println(wkt_tkr);
		
		
		
		System.out.println(wktTkrName("Chad Soper"));
		System.out.println(wktTkrName("Kiplin Doriga"));

		System.out.println(getScoreData("Kiplin Doriga"));
	}

	
	
	public static String wktTkrName(String batsman) {
		String wkt_tkr =
				driver.findElement(By.xpath("(//span[text()='"+batsman+"']/ancestor::td/following-sibling::td)[1]"))
					.getText();
		
		return wkt_tkr;
	}
	
	
	
	public static List<String> getScoreData(String batsman) {
		List<WebElement> scoreEles = driver.findElements(By.xpath("//span[text()='"+batsman+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
	List<String> scoreCardList= new ArrayList<String>();
		
		for (WebElement e : scoreEles) {
			String text=e.getText();
			scoreCardList.add(text);
			
		}
	
	return scoreCardList;
	}
	
	
	
	
	
	
	
	
	
}
