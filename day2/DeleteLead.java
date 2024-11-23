package HomeAssignmentweek2.day2;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException{
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
		// click account tab and click create lead 
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Phon")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("7708246734");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//capture the first Lead 
		WebElement capture = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String value = capture.getText();
		System.out.println("Capture Lead id:"+value);
		//View the first lead		
				driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//Delete 
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
		// Click Find Lead 
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Passing the capture value
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(value);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
	}
}

      
