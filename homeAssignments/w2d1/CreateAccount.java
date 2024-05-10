package homeAssignments.w2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String args[]) {
		
		//Launch Browser		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Login into the Account
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sankari Nagarajan");
		
		//Select Industry Drop Down
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select (industryDD);
		industry.selectByIndex(3);
		//Select Ownership Drop Down
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select (ownershipDD);
		owner.selectByVisibleText("S-Corporation");
		//Select Source Drop Down
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select source = new Select (sourceDD);
		source.selectByValue("LEAD_EMPLOYEE");
		//Select Market Campaign Drop Down
		WebElement marketDD = driver.findElement(By.id("marketingCampaignId"));
		Select market = new Select (marketDD);
		market.selectByIndex(6);
		//Select State Drop Down
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select (stateDD);
		state.selectByValue("TX");
		
		//Create Account
		driver.findElement(By.className("smallSubmit")).click();
		
		//Create Account Ignoring Duplicates
		driver.findElement(By.partialLinkText("Duplicates")).click();
		
		//Close the browser
		driver.close();
		
	}

}
