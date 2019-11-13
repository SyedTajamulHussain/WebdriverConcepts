package webdriverSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class googleSearch_overLay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		// driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("watch");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		 Thread.sleep(3000);
		 //List<WebElement> listofResults=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		 List<WebElement> listofResults=driver.findElements(By.xpath(".//div[@id='suggestions-template']//div//descendant::div[@class='s-suggestion']"));
		
		 System.out.println(listofResults.size());
		 
		 
		 for(int i=0;i<listofResults.size();i++) {
			 System.out.println(listofResults.get(i).getText());
			 if(listofResults.get(i).getText().contains("watch box organizer")) {
				 listofResults.get(i).click();
				 break;
				 
			 }
			 
		 }
		 
		
	}

}
