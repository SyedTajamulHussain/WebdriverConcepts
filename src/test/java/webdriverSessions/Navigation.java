package webdriverSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
driver.get("https://google.com");
Thread.sleep(2000);
driver.navigate().to("https://amazon.co.in");
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().refresh();

	}

}
