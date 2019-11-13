package webdriverSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
				
				driver.findElement(By.id("cookie_action_close_header")).click();

				
				JavascriptExecutor jsA = ((JavascriptExecutor) driver);
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				jsA.executeScript("scroll(0, 600);");
		
				driver.switchTo().frame(0);  // switching to frame by index
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				js.executeScript("scroll(0, 1200);");
				
				
				driver.switchTo().frame("iframe2"); //Switching to frame by string.
				
				
				JavascriptExecutor jse = ((JavascriptExecutor) driver);
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				jse.executeScript("scroll(0, 1200);");
				//driver.findElement(By.xpath("//a[contains(.,'What is Protractor?')]")).click();
				Thread.sleep(5000);
				//driver.quit();
	}

}
