package homeAssignmentweek5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticParameterization {
	

	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("leaf@2024");
	driver.findElement(By.id("Login")).click();
}
