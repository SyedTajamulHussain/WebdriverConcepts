package webdriverSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFIle {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		 Properties prop = new Properties(); 
		 FileInputStream ip = new  FileInputStream("C:\\MyPersonalWorkSpace\\com.qa.SeleniumTraining\\src\\test\\java\\com\\qa\\WebDriverTraining\\config.properties");
		 prop.load(ip);
		 System.out.println(prop.getProperty("name"));
		 
		String urll= prop.getProperty("url");
		System.out.println(urll);
		
		String browsername =prop.getProperty("browser");
		System.out.println(browsername);
		
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver" , "C:\\Drivers\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}else if (browsername.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver" , "C:\\Drivers\\geckodriver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver" , "C:\\Drivers\\IEDriverServer\\IIEDriverServer.exe");
																				
			driver= new InternetExplorerDriver();
		}
		
		driver.get(urll);
		
		
	}

}
