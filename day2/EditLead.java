package HomeAssignmentweek2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	      //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on Crm sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		//click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//FirstName using attribute bases xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testing Lead12");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Testdummy");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Dummy");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Dummy");
		//Department
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("sales");
		//Description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testing the testleaf application");
		//email
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Testdummy@gmail.com");
		//state
		WebElement statedropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		//create a object for state dropdown
		Select opt= new Select(statedropdown);
		opt.selectByVisibleText("New York");
		//click on create lead
		driver.findElement(By.name("submitButton")).click();
		//click on Edit
				driver.findElement(By.linkText("Edit")).click();
		//Clear the description field
				driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		//Enter values on important field
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Noted");
		//click on update
				Thread.sleep(3000);
				driver.findElement(By.name("submitButton")).click();
				// get the page Title
				Thread.sleep(3000);
				String title = driver.getTitle();
				System.out.println("Page title is : " +title);
				driver.close();
				
				
		
	}

}
