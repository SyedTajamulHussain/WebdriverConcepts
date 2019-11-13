package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTableTrick2 {

	public static void main(String[] args) throws InterruptedException {
		//Preceding and parenting xpath method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://ui.cogmento.com/");
		 driver.findElement(By.name("email")).sendKeys("tajamulsyed26@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Welcome!123"); 
		 
		 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//td[contains(text(),'Syed Zahid')]//parent::td//preceding-sibling::td//input[@name='id']")).click();

	}

}
