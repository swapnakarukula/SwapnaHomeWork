package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		
		/* Assignment 2:
			
			1) Launch URL: http://leaftaps.com/opentaps/control/main
			2) Enter UserName (Demosalesmanager)
			3) Enter Password (crmsfa)
			4) Click Login
			5) Click CRM/SFA link
			6) Click Create Lead
			7) Enter Company Name
			8) Enter First Name
			9) Enter Last Name
			10) Click Create lead
			11) Verify the first name
		 
		 */
		
		
		String Firstname = "Swapna";
		
		String Lastname = "Karukula";
		
		String Company = "Test Leaf";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
					
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//a[contains(@href,'crmsfa')]").click();
			
		Thread.sleep(1000);
		
		driver.findElementByXPath("//div[@id='left-content-column']/div[5]").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("(//div//input[@name='companyName'])[1]").sendKeys(Company);
			 		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//div[@id='quickNewLead']//input[@name='firstName']").sendKeys(Firstname);
		
		Thread.sleep(1000);
							
		driver.findElementByXPath("//div[@id='quickNewLead']//input[@name='lastName']").sendKeys(Lastname);
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//button[contains(text(),'Create Lead')]").click();
				
		
		  Thread.sleep(1000);
		  
		  driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		  

		  Thread.sleep(1000);
		  
		  driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		  

		  Thread.sleep(1000);
		  
		  
		  driver.findElementByXPath("(//div[@class='x-panel x-panel-noborder x-form-label-right'])[2]//input[@name='firstName']").sendKeys(Firstname);
		  
		  driver.findElementByXPath("(//div[@class='x-panel x-panel-noborder x-form-label-right'])[2]//input[@name='lastName']").sendKeys(Lastname);
		  
		  driver.findElementByXPath("(//div[@class='x-panel x-panel-noborder x-form-label-right'])[2]//input[@name='companyName']").sendKeys(Company);
		  
		  driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		  
		  Thread.sleep(1000);
		 
		  String fname = driver.findElementByXPath("//table[@class='x-grid3-row-table']//td[contains(@class,'firstName')]//a").getText();
		  
		  System.out.println(fname);
		
	}

}
