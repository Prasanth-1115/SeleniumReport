package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9962886186");
		driver.findElement(By.xpath("//buttong[text()='Find Leads']")).click();
		
		WebElement leadId = driver.findElement(By.xpath("//a[text()='11716']"));
		String leadId1 = leadId.getText();
		System.out.println(leadId1);
		driver.findElement(By.xpath("//a[text()='11716']")).click();
		driver.findElement(By.xpath("//a[text()=Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name=id']")).sendKeys("11716");
		driver.findElement(By.xpath("//button[text()=' Find Leads']")).click();
		WebElement noRecord = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String noRecord1 = noRecord.getText();
		System.out.println(noRecord1);
		driver.close();
		
		
		
	}

}
