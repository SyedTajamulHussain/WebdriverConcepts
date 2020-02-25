package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTypesOfScrolling {

	public static void main(String[] args) {
		
		//scrollintoView();
		scrollBy();
	}	
	
	public static void scrollintoView() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement contactUsLink =driver.findElement(By.linkText("Contact Us"));
		
		js.executeScript("arguments[0].scrollIntoView();", contactUsLink);
		
		contactUsLink.click();	
		driver.navigate().back();
		
		
		WebElement DealsOfTheDay= driver.findElement(By.xpath("//h2[contains(text(),'Deals of the Day')]"));
		js.executeScript("arguments[0].scrollIntoView();" ,DealsOfTheDay);
			
		//WebElement OfferOfTheDay= driver.findElement(By.xpath("//h2[contains(text(),'Best Offers for Men')]"));
		//js.executeScript("arguments[0].scrollIntoView();" ,OfferOfTheDay);
		
		WebElement facebook =driver.findElement(By.linkText("Facebook"));
		js.executeScript("arguments[0].scrollIntoView();", facebook);
		facebook.click();
		driver.navigate().back();
		

		}
	
	public static void scrollBy() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
	
		js.executeScript("window.scrollBy(0,4000)");
	    // This  will scroll down the page by  1000 pixel vertical
		//driver.findElement(By.linkText("Careers")).click();
		js.executeScript("window.scrollBy(0,1000)");
		
	}

}
