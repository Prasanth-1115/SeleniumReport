package weeek2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Load the url 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		 //Find the element username  Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Find the element password Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(1000);
		
		//Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//Close the Browser
		//driver.close();
		
		
	}

}
