package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment_day3 {

	public static void main(String[] args) throws InterruptedException {
		
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
					
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@type='submit']").click();
			
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		driver.findElementByXPath("//div/a[contains(text(),'Leads')]").click();
		
		driver.findElementByXPath("//div//a[contains(text(),'Find Leads')]").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Swapna");
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	
		Thread.sleep(2000);
	
	//	System.out.println(driver.findElementByXPath("(//a[@class='linktext'])[4]").getText());
		
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		String pageTitle = driver.getTitle();
		
		System.out.println("The page title is:"+pageTitle);
		
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		
		String companyname = "Swapna_Test";
		
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(companyname);
		
		driver.findElementByXPath("//input[@value='Update']").click();
		
		String uptcompanyname =  driver.findElementByXPath("(//span[@class='tabletext'])[3]").getText();
	
		String[] arrOfStr = uptcompanyname.split(" ", 2);
		
		//System.out.println(arrOfStr[0]);
		
		
		if (companyname.equalsIgnoreCase(arrOfStr[0])) {
			
			System.out.println("The Companyname is equal");
			
		}
		
		else
		{
		System.out.println("The companyname is not equal");
		}
		
		driver.findElementByXPath("(//span[@class='tabletext'])[3]").click();
		
	    driver.quit();
	
	}
	

}
