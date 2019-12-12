package week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAssignment {

	
	public static void main(String[] args)  {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("twotabsearchtextbox").sendKeys("Television 43 inch");

		driver.findElementByXPath("(//input[@type='submit'])[1]").click();

		List<WebElement> tvElementNames = driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");
		
		List<String> specialTVElement = new ArrayList<String>(); //declaring a List to store the TV Names
		
		int tvCount = tvElementNames.size();
		
		List<String> sortTVNames = new ArrayList<String>();
		
		for (int i=0; i<tvCount; i++ ) {     //Get all the TV Names and Make a note of TV name which has SAMSUNG word 
			
			String tvNames = tvElementNames.get(i).getText();
			
				if(tvNames.contains("Samsung")) {
				
				specialTVElement.add(tvNames); //adding the TV names to the list
								
			}
	
		System.out.println("The total number of Sumsung TVs in the list are :"+specialTVElement.size());
			
		}
		
		Collections.sort(specialTVElement);  //sorting the TV Names
				
		System.out.println("List value after sort: "+specialTVElement);
		
}

	
}

