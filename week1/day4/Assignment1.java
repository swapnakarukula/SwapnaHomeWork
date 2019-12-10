package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
					
		driver.get("http://leafground.com/pages/Edit.html");
	
		
		//Enter your email address
		
		driver.findElementById("email").sendKeys("swapna.k@gmail.com");
		
		// append a text and press keyboard tab
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("swapna");
		
		//Get default text entered
		
		String gettext = driver.findElementByXPath("//input[@value='TestLeaf']").getText();
		
		System.out.println(gettext);
		//clear the text
		
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		
		
		//isEnabed()
		
		boolean isdisplayed = driver.findElementByXPath("//div[@class = 'example'][5]//input").isEnabled();
		
		if(isdisplayed==false)
		{
			System.out.println("Confirm that edit field is disabled:"+isdisplayed);	
		}
		else
		{
			System.out.println("Confirm that edit field is enabled:"+isdisplayed);	
		}
		
		driver.quit();
	}

}
