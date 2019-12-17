package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath("//a[@href='pages/Alert.html']").click();
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		driver.quit();
		
		
			
	}

}
