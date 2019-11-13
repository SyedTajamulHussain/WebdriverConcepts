package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import javafx.scene.Scene;

public class HTMLUnitDriver {

	public static void main(String[] args) {
	
		/*Advantages of HTMLUnitDriver/ ghost driver/headless
		1. testing is happening behind the Scene no browser launched
		2. very fast as browser is not loader
		
		Disadvantages  of HTMLUnitDriver/ ghost driver/headless
		1.not suitable for action class*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver =new HtmlUnitDriver();
	
		driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
		String Title1=driver.getTitle();
		System.out.println(Title1);

		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[1]/a/span/span")).click();
		
		String title2= driver.getTitle();
		System.out.println(title2);
		}

}
