package webdriverSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		List<WebElement> checkboxoptions = driver
				.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		System.out.println(checkboxoptions.size());

		// Selecting one checkbox
		
		  for (int i = 0; i < checkboxoptions.size(); i++) {
		  System.out.println(checkboxoptions.get(i).getText()); if
		  (checkboxoptions.get(i).getText().contains("MySQL")) {
		  checkboxoptions.get(i).click(); break;
		  
		  } }
		 

		// selecting all options in dropdown
		/*for (int i = 0; i < checkboxoptions.size(); i++) {
			System.out.println(checkboxoptions.get(i).getText());
			checkboxoptions.get(i).click();

		}*/
	}

}
