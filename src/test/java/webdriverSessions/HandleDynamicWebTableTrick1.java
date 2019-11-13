package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTableTrick1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://ui.cogmento.com/");
		 driver.findElement(By.name("email")).sendKeys("tajamulsyed26@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Welcome!123"); 
		 
		 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		 Thread.sleep(3000);
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		 
		 String Befor_Xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		 String After_Xpath = "]/td[2]";
		 
		 for(int i=1;i<=3;i++) {
			String names =driver.findElement(By.xpath(Befor_Xpath + i + After_Xpath)).getText();
			System.out.println(names);
			if(names.contains("Syed Zahid")) {
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/input
				 Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[" + i +"]/td[1]/div/input")).click();
				 //driver.findElement(By.xpath("//td[contains(text(),'Syed Zahid')]//parent::td//preceding-sibling::td//input[@name='id']")).click();

				 Thread.sleep(3000);			}
		 }

	}

}
