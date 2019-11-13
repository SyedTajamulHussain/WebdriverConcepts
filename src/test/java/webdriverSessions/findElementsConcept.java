package webdriverSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 
		 //get the total count of links
		 //list is in java
		 //webelements is selenium
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//get text of each text of link
		
		for(int i=0;i<links.size();i++) {
			String txt =links.get(i).getText();	
			System.out.println(txt);
		}

	}

}
