package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_IsSelected_isEnabled {

static WebDriver driver;
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
			
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.flipkart.com/");
			 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
					 
			
			 //is displayed method
			 boolean isdisplayed = driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).isDisplayed();
			 System.out.println(isdisplayed);  // this will print either true or false.
			
			//is enabled button
			
			boolean isenabled=driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).isEnabled();
			System.out.println(isenabled);

			driver.quit();
			isselected();
		
		}
		
		public static void isselected() {
			//is selected is only for checkboxs , radiobutton and dropdown
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://register.freecrm.com/register/");
			boolean isselected=driver.findElement(By.id("terms")).isSelected();
			System.out.println(isselected);
			driver.findElement(By.id("terms")).click();
			boolean isselected2=driver.findElement(By.id("terms")).isSelected();
			System.out.println(isselected2);
			
		}

	}


