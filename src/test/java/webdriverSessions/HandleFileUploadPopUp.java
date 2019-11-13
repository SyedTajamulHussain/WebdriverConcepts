package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://html.com/input-type-file/");
		
		//Scrolldown
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("scroll(0, 1100);");
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("fileupload")).sendKeys("C:/Users/syehussa0/Desktop.jpg");
		

	}

}
