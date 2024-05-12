package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	// before
	
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS -- DB connection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BS -- Create user");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launcg browser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM -- log in");
	}
	// test cases

	@Test
	public void titleTest() {
		System.out.println("Title test");

	}

	@Test
	public void headerTest() {
		System.out.println("Header Test");
	}

	@Test
	public void urltest() {
		System.out.println("url test");
	}

	// After

	@AfterMethod
	public void logout() {
		System.out.println("log out");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("delete user");
	}

	
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("disconnect with DB");
	}

}
