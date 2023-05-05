package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class.username]")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//inputs[@id")).sendKeys("Leaf@1234");
	}

}
