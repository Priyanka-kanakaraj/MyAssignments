package HomeAssignmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateNewAccount {
	public static void main(String[] args) throws InterruptedException{
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
      //implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//webelements 
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Dassboss");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	WebElement dropdown = driver.findElement(By.name("industryEnumId"));
	//create a object for industry dropdown
	Select opt= new Select(dropdown);
	opt.selectByIndex(2);
	WebElement drp = driver.findElement(By.name("ownershipEnumId"));
    //Create a object for ownership dropdown
	Select opts= new Select(drp);
	opts.selectByVisibleText("S-Corporation");
	WebElement drop = driver.findElement(By.id("dataSourceId"));
	//Create a object for Source dropdown
	Select option= new Select(drop);
	option.selectByValue("LEAD_EMPLOYEE");
	WebElement dr = driver.findElement(By.id("marketingCampaignId"));
	//Create a object for Source dropdown
	Select options= new Select(dr);
	options.selectByIndex(5);
	WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	//Create a object for Source dropdown
		Select ption= new Select(state);
	 ption.selectByValue("TX");
	 //create Account
	 driver.findElement(By.className("smallSubmit")).click();
	 Thread.sleep(3000);
	 driver.close();
}
}
