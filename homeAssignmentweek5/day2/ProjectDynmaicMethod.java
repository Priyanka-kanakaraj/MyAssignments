package homeAssignmentweek5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectDynmaicMethod {
		public ChromeDriver driver;
		public ChromeOptions option;
		

		@Parameters({"URL","browser","userName","password"})
		@BeforeMethod	
		public void preConditions(String url,String browser, String uName, String passW) {
			option = new ChromeOptions();
			option.addArguments("--incognito");
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			//login
			driver.findElement(By.id("username")).sendKeys(uName);
			driver.findElement(By.id("password")).sendKeys(passW);
			driver.findElement(By.id("Login")).click();


	}
		@AfterMethod
		public void postConditions() {
			driver.quit();
}
}