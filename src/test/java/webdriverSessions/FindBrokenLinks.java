package webdriverSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.crmpro.com/");
		//Get the list of all links and images : 
		 List<WebElement> LinkList =driver.findElements(By.tagName("img"));
		 LinkList.addAll(driver.findElements(By.tagName("a")));
		
		 System.out.println("Size of All links and images" + LinkList.size());
		 
		 List<WebElement> activeLinks = new ArrayList<WebElement>();
		 
		 //iterate linklist and excule links and images who do not have href
		
		 for(int i=0;i<LinkList.size();i++) {
			 System.out.println(LinkList.get(i).getAttribute("href"));
			if(LinkList.get(i).getAttribute("href")!=null && (!LinkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(LinkList.get(i));
			}
		}
		//get the size of active links
		 System.out.println("Size of active links and images" + activeLinks.size());

		 //check the href url with httpconnection api
		 
		 for (int a=0; a<activeLinks.size();a++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(a).getAttribute("href")).openConnection();
			connection.connect();
			String responce =connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(a).getAttribute("href") + "---> "+ responce);
		 }
	}

}
