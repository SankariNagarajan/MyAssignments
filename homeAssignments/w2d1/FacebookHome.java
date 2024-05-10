package homeAssignments.w2d1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {
	
	public static void main (String args[]) {
		
		
		//Load Facebook Webpage
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Create New Account
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Virat");
		driver.findElement(By.name("lastname")).sendKeys("Kohli");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Virat@18");
		
		//Select Day Drop Down
		WebElement dayDD = driver.findElement(By.id("day"));
		Select day = new Select (dayDD);
		day.selectByIndex(1);
		//Select Month Drop Down
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month = new Select (monthDD);
		month.selectByVisibleText("Nov");
		//Select Year Drop Down
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year = new Select (yearDD);
		year.selectByValue("1990");
		
		//Select Radio Button
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}

}
