package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolPromtAssignment {

	public static void main(String[] args) {
			
	String name = "Swapna";
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();

	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	WebElement myframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
	
	driver.switchTo().frame(myframe);
	
	driver.findElementByXPath("//button[text()='Try it']").click();
	
	Alert alert = driver.switchTo().alert();
		
	alert.sendKeys(name);
	
	alert.accept();
	
	String text = driver.findElementByXPath("//p[@id='demo']").getText();
	
		//System.out.println(text);
		
		String[] strarray = text.split(" ", 3);
		
		//System.out.println(strarray[1]);
		
		String[] name1 = strarray[1].split("!");
		
		System.out.println(name1[0]);
		
		if (name.equalsIgnoreCase(name1[0])) {
			
			System.out.println("The entered name is displayed in the iframe");
		}
		
		else
		{
			System.out.println("The name is not displayed in the iframe ");
		}
		
		}

}
