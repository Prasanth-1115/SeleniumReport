package week2.day2;

import java.time.Duration;

import org.apache.commons.io.input.TimestampedObserver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Prasanth");
		driver.findElement(By.name("lastname")).sendKeys("Ramu");
		driver.findElement(By.name("reg_email__")).sendKeys("9962886186");
		driver.findElement(By.id("password_step_input")).sendKeys("asdf1234");
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		Select day1=new Select(day);
		day1.selectByIndex(11);
		WebElement month=driver.findElement(By.id("month"));
		month.click();
		Select month1=new Select(day);
		month1.selectByValue("11");
		WebElement year=driver.findElement(By.id("year"));
		year.click();
		Select year1 = new Select(year);
		year1.selectByVisibleText("1992");
		WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
		gender.click();
		
	}

}
