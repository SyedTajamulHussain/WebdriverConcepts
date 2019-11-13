package webdriverSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Page load is for the time given for a page to load...time is specified and it will skip remaining time
		//Implicit wait is for to igve time to all elements on the page to load..time is specified and it will skip remaining time.
		//both page load and  implicit wait are global wait.
		//these are also called dynamic wait.
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		driver.get("https://www.flipkart.com/");
//thread.sleep is hard wait
	}

}
