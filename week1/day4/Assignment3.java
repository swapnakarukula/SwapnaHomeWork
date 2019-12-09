package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
			
		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com");;
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		
		driver.findElementByXPath("//button[@id='buttonLogin']").click();
		
		Thread.sleep(1000);
	
		driver.findElementByXPath("//div[@id='dashmenu']/div[5]").click();
		
		driver.findElementByXPath("//div[@id='dashmenu']/div[5]/ul/li/a[contains(text(),'Search for Vendor')]").click();
		
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Clipboard Papers");
		
		driver.findElementByXPath("//button[@id='buttonSearch']").click();
		
		String Vendor = driver.findElementByXPath("//table[@class='table']//tbody//tr//td[1]").getText();
		
		String country = driver.findElementByXPath("//table[@class='table']//tbody//tr//td[5]").getText();
		
		System.out.println("The Vendor's "+Vendor+" "+"Country is: "+country);
		
		driver.findElementByXPath("//a[contains(text(),'Log Out')]").click();
		
		driver.close();
				
	}

}
