package week2.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Assignment 1:
		 *  1.Launch url https://erail.in/
		 *  2. Enter From as Chennai ,then press tab 
		 *  3. Enter to as Bangalore 
		 *  4. Uncheck Sort on date 
		 *  5. Click on Get Trains 
		 *  6. Get all Trains name and Print them 
		 *  7. Remove Duplicates in train Names 
		 *  8. Get All the Train Numbers.
		 */
				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.findElementByXPath("//input[@placeholder='From Station']").clear();
		
		driver.findElementByXPath("//input[@placeholder='From Station']").sendKeys("Chennai", Keys.TAB);
		
		driver.findElementByXPath("//input[@placeholder='To Station']").clear();
		
		driver.findElementByXPath("//input[@placeholder='To Station']").sendKeys("Bangalore", Keys.TAB);
		
		Thread.sleep(1000);
		
		WebElement sortOnDate = driver.findElementByXPath("(//input[@type='checkbox'])[3]");
		
		sortOnDate.click();
		
		driver.findElementByXPath("(//input[@type='button'])[1]").click();
		
		Thread.sleep(2000);
		
		List<WebElement> trainNames = driver.findElementsByXPath("//table[contains(@class,'DataTable TrainList')]/tbody[1]/tr/td[2]");
		
	    List<String> TrainNames = new ArrayList<String>();
		
		System.out.println("The Total trains from Chennai to Bangalore:"+ trainNames.size());
		
		for (WebElement eachTrainNames : trainNames) {
			
			TrainNames.add(eachTrainNames.getText());
						
		}
		
		
		  List<String> uniqueTrainNames1 = new ArrayList<String>();
		  		 
		  for (String noDuplicateTrains : TrainNames) {
			
			  if(!uniqueTrainNames1.contains(noDuplicateTrains)) {
				  
				  uniqueTrainNames1.add(noDuplicateTrains);
				  
			  }
			  
			 		  
		}
		  
		  System.out.println(uniqueTrainNames1);	
		  
		  	 
		  }
		 
		
	}


