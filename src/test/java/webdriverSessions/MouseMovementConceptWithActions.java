package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConceptWithActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 
		 Actions ac = new Actions(driver);
		 ac.moveToElement(driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8' and contains(.,'Electronics')]"))).build().perform();

		ac.click(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a"))).build().perform();
}
}
