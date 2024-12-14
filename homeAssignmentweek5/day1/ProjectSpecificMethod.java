package homeAssignmentweek5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public ChromeOptions option;
	@BeforeMethod
	public void precondition() {
	    option = new ChromeOptions();
	    option.addArguments("--incognito");
	    option.addArguments("--disable-notifications");
		driver=new ChromeDriver((ChromeOptions)option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
	}
		
		@AfterMethod
		public void postcondition() {
		driver.quit();
		
	}

}
