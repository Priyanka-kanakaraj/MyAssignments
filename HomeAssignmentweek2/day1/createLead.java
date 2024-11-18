package HomeAssignmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().window().maximize();
			      //implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("little");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("John");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
				driver.findElement(By.className("smallSubmit")).click();
				// getTitle() to obtain page title
				String title = driver.getTitle();
				System.out.println("Page title is : " +title);
				driver.close();
						}

}
