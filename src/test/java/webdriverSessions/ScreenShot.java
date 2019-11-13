package webdriverSessions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot {

	public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://google.com");
		
		//Take screen shot
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("/C:\\MyPersonalWorkSpace\\com.qa.SeleniumTraining\\src\\test\\java\\com\\qa\\WebDriverTraining\\google.png"));
		
		//make sure to download : org.apache.commons.io.jar and addd to external jars
	}

}
