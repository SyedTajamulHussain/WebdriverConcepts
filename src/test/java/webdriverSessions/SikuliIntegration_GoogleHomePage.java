package webdriverSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliIntegration_GoogleHomePage {

	public static void main(String[] args) throws FindFailed {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			Screen clic =new Screen();
			
			Pattern pt = new Pattern("SignUPButton.PNG");
			clic.wait(pt, 2000);
			clic.click();

	}

}
