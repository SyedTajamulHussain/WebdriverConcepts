package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalender {
///incomplete 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		 driver.manage().window().maximize();
		 //driver.findElement(By.name("email")).sendKeys("tajamulsyed26@gmail.com");
		 //driver.findElement(By.name("password")).sendKeys("Welcome!123");
		 driver.findElement(By.id("datepicker")).click();
		 Thread.sleep(3000);
		// driver.findElement(By.xpath("//span[contains(text(),'Calendar' )]")).click();
		 
		 driver.switchTo().frame(0);
		 String date = "11/12/2019";
		 String dateArray[]=date.split("-");
		 String Month = dateArray[0];
		 String Date = dateArray[1];
		 String year = dateArray[2];
		 
		 
		 Select selepre = new Select(driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")));
		 selepre.selectByVisibleText(Month);
		 
		 Select selecfuture = new Select(driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")));
		 selecfuture.selectByVisibleText(Month);
	}

}
