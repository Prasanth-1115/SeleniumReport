package weeek2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createcontacts {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
	//Load the url http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	//Maximize the browser
		driver.manage().window().maximize();
		
		//enter Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the element password Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login Buttong
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Contacts
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on create contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Create First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Prasanth");
		
		//Create Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Ramu");
		
		//click create contact button
		driver.findElement(By.name("submitButton")).click();
		
		WebElement firstName = driver.findElement(By.id("viewContact_firstName_sp"));
		String text1 =firstName.getText();
		System.out.println(text1);
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.close();		
		
		
		
		
	
	}

}
