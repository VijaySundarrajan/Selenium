package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "chrome";
		BrowserUtil brutil = new BrowserUtil();

		brutil.launchBrowser(browserName);
		brutil.launchURL("http://www.amazon.com");
		String actTitle = brutil.getPageTitle();
		System.out.println("Page Title: "+actTitle);
		if (actTitle.contains("Amazon")) {
			System.out.println("Title --pass");
		} else {
			System.out.println("Title--Fail");
		}
		String url= brutil.getPageURL();
		System.out.println("Page URL: "+url);
		if (url.contains("amazon.com")) {
			System.out.println("URL -- Pass");
		}
		else {
			System.out.println("URL --Fail");
		}
		brutil.closeBrowser();
	}

}
