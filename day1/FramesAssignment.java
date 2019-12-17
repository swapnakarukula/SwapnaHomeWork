package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement eframe = driver.findElementByXPath("//iframe[@class='demo-frame']");
		
		driver.switchTo().frame(eframe);
		
		driver.findElementByXPath("//li[text()='Item 1']").click();
		
		driver.switchTo().defaultContent(); //go back to default webpage
		
		driver.findElementByXPath("//a[text()='Download']").click();
	}

}
