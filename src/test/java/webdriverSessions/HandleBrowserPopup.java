package webdriverSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/");
		
		driver.findElement(By.xpath("//a[@href='popuptest1.html']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator <String>it=handler.iterator();
		String Parentwindow =it.next();
		System.out.println("Parent window " + Parentwindow );
		String childwindow=it.next();
		System.out.println("child window 1 " + childwindow );
		driver.switchTo().window(childwindow);
		System.out.println("Child window title :" + driver.getTitle());
		driver.close();
		
		String childwindow2=it.next();
		driver.switchTo().window(childwindow2);
		driver.close();
		String childwindow3=it.next();
		driver.switchTo().window(childwindow3);
		driver.close();
		String childwindow4=it.next();
		driver.switchTo().window(childwindow4);
		driver.close();
		String childwindow5=it.next();
		driver.switchTo().window(childwindow5);
		driver.close();
		String childwindow6=it.next();
		driver.switchTo().window(childwindow6);
		driver.close();
		
		driver.switchTo().window(Parentwindow);
		System.out.println("Parent window title :" + driver.getTitle());
	}

}
