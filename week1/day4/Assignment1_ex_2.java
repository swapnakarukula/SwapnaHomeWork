package week1.day4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
					
		driver.get("http://leafground.com/pages/Button.html");
	
		//click button to travel home page
		
		String url = driver.findElementById("home").getAttribute("onclick");
		
		System.out.println("Home page:"+url);
				
		//Get Position of a button
		
		System.out.println("The button position is :" +driver.findElementById("position").getLocation());
		
		//Find button color
		
		System.out.println("Button color is:"+driver.findElementById("color").getCssValue("background-color"));
		
		//Find button height and width
		
		System.out.println("Button height is:"+driver.findElementById("size").getSize().getHeight());
		
		System.out.println("Button width is:"+driver.findElementById("size").getSize().getWidth());
					
		driver.quit();
		
		
	}
	

}
