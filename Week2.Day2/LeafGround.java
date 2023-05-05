package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	
	public static void main(String[] args) {
		
		//Launch the Browser 
		ChromeDriver driver =new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.leafground.com/input.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Find the element type your name  Enter the Name
		driver.findElement(By.name("j_idt88:name")).sendKeys("Prasanth");
	}

}
