package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	

	@Test(priority = 1)
	public void titleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title is not matched");

	}

	@Test(priority = 2)
	public void imageTest() {
		Boolean flag=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		//Assert.assertEquals(flag,true);
		Assert.assertTrue(flag);
	
	}

	@Test(priority = 3)
	public void urltest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
	}

	
	
	
	
	
	
	
}
