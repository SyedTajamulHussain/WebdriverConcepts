package webdriverSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliIntegrationWithWebDriver_YOUTUBEVIDEO {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=hMy5za-m5Ew");
		
		Screen s = new Screen();
		
		Pattern Pt = new Pattern("pause.PNG");
		s.wait(Pt,2000);
		s.click();
		
		Pattern Pt1 = new Pattern("playbutton.PNG");
		s.wait(Pt1,2000);
		s.click();

		
		Pattern setting = new Pattern("Setting.PNG");
		s.wait(setting,3000);
		s.click();

	}

}
