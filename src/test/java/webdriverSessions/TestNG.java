package webdriverSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
	public void setup() {
		System.out.println("BeforeSuite-Setup system properties");
	}

	@BeforeClass
	public void login() {
		System.out.println("BeforClasslogin");
	}

	@BeforeMethod
	public void enterurl() {
		System.out.println("BeforeMethod-Enter URL");
	}

	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("BeforeTest-launchBrowser");
	}

	@Test(priority=3 ,enabled=true)
	public void testuserid() {
		System.out.println("MainTest1-testing userid");
	}
	
	@Test(priority=2,enabled=true)
	public void testpassword() {
		System.out.println("MainTest2-testing password");
	}
	
	@Test(priority=1,enabled=false)
	public void loginbutton() {
		System.out.println("MainTest3- loginbutton");
	}

	@AfterTest
	public void DeleteCookies() {
		System.out.println("AfterTest-Delete cookies");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AfterMethod-logout from app");
	}

	@AfterClass
	public void quitbrowser() {
		System.out.println("AfterClass-close the browser");
	}

	@AfterSuite
	public void generatetestReport() {
		System.out.println("AfterSuite-Generate the report");
	}
}
