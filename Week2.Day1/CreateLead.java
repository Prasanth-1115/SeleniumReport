package weeek2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasanth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sumeshkumar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Automation Testing");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prasanth1196@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		
			
				
		
		
	}

}
