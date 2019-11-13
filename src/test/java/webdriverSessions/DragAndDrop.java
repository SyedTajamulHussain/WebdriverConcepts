package webdriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions ac =new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		//ac.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		//.release().build().perform();

	}

}
