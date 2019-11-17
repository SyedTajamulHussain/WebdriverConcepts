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
		System.out.println("Setup system properties");
	}

	@BeforeClass
	public void login() {
		System.out.println("login");
	}

	@BeforeMethod
	public void enterurl() {
		System.out.println("Enter URL");
	}

	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("launchBrowser");
	}

	@Test
	public void testuserid() {
		System.out.println("testing userid");
	}
	
	@Test
	public void testpassword() {
		System.out.println("testing password");
	}

	@AfterTest
	public void DeleteCookies() {
		System.out.println("Delete cookies");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}

	@AfterClass
	public void quitbrowser() {
		System.out.println("close the browser");
	}

	@AfterSuite
	public void generatetestReport() {
		System.out.println("Generate the report");
	}
}
