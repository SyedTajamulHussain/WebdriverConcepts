package webdriverSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
		
		
	//	explicitWaitMethod(driver, driver.findElement(By.xpath("//span[contains(text(),'Cart')]")),20);
		explicitWaitMethodForClickOn(driver, driver.findElement(By.xpath("//span[contains(text(),'Cart')]")), 20);

	}
	
	public static void explicitWaitMethodForClickOn(WebDriver driver, WebElement locator,int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
//this explicit wait method can be used in all find elements scenario.
}
