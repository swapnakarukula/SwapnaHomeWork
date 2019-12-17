package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMultipleOptions {

	public static void main(String[] args) {
	
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath("//a[@href='pages/selectable.html']").click();
		
		List<WebElement> options = driver.findElementsByXPath("//ol[@id='selectable']/li");
		System.out.println(options.size());
				
		Actions builder = new Actions(driver);
	
		builder.keyDown(Keys.LEFT_CONTROL)
		.click(options.get(1))
	    .click(options.get(2))
	    .click(options.get(3))
	    .keyUp(Keys.LEFT_CONTROL)
	    .perform();
		
		
		
			
		
	}

}
