package seleniumSessions;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		String Uname= "admin";
		String pwd= "admin";
				
		
		
		
		//driver.get("https://"+Uname+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://vijay:vjy@the-internet.herokuapp.com/basic_auth");
		
		
		//Sel 4.x:
		//HasAuthentication
		
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(Uname, pwd));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
