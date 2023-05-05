package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class LearnImplicitWait {
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		//Load the URL
		driver.get("http://login.saleforce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		 driver.findElement(By.className("slds-icon-waffle")).click();
		 
		//Login submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
	}

}
