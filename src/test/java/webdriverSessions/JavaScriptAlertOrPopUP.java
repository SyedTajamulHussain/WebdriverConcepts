package webdriverSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertOrPopUP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://mail.rediff.com");
		driver.navigate().to("https://mail.rediff.com");
		driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		
		
		String alerttext =alert.getText();
		if(alerttext.equals("Please enter a valid user name")) {
			System.out.println("Text is matching | Test case pass" );
		}
		else {
			System.out.println("Test case failed");
		}

		
		alert.accept();

	}

}
