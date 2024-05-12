package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil {

	 static WebDriver driver;

		public static void main(String[] args) {
			
			
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");	
			
			By links=By.tagName("a");
			By imgs = By.tagName("img");
			
//			System.out.println(getElements(links).size());
//			System.out.println(getElements(imgs).size());
	
//			System.out.println("total links: "+ getElementsSize(links));
//			
//			System.out.println("total imgs: "+ getElementsSize(imgs));
//
//			ArrayList<String> eleLinkText=getElementTextList(links);
//
//			System.out.println(eleLinkText);
			
			ArrayList<String> eleAltValues=getElementAttributeList(imgs, "alt");
			
			System.out.println(eleAltValues);
			
	
	}

		
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		public static int getElementsSize(By locator) {
			return driver.findElements(locator).size();
		}
		
		public static ArrayList<String> getElementTextList(By locator) {
			List<WebElement> eleList=getElements(locator);
			ArrayList<String> eleTextList = new ArrayList<String>();
			for (WebElement e : eleList) {
				
				String text=e.getText();
				if (text.length() !=0) {
					eleTextList.add(text);
					//System.out.println(text);
				}
				
			}
			
			return eleTextList;
		}
		
		public static ArrayList<String> getElementAttributeList(By locator, String attrName) {
			List<WebElement> eleList=getElements(locator);
			ArrayList<String> eleAttrList= new ArrayList<String>();
			for (WebElement e : eleList) {
				
				String attrValue=e.getAttribute(attrName);
				if (attrValue.length()!=0) {
					eleAttrList.add(attrValue);
				}
				
			}
			return eleAttrList;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
