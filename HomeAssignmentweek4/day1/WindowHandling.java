package HomeAssignmentweek4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the user name and password 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on submit
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on contacts
		driver.findElement(By.linkText("Contacts")).click();
		//click on merge contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
		Set<String> contactID = driver.getWindowHandles();
		List<String> lst = new ArrayList(contactID);
		//handling windows
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div")).click();
		driver.switchTo().window(lst.get(0));
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
		Set<String> fromcontact = driver.getWindowHandles();
		List<String> lst2 = new ArrayList(fromcontact);
		driver.switchTo().window(lst2.get(1));
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[3]/a")).click();
		Set<String> tocontact = driver.getWindowHandles();
		List<String> lst3 = new ArrayList(tocontact);
		driver.switchTo().window(lst3.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();


		driver.switchTo().alert().accept();
		String contactName = driver.findElement(By.xpath("//span[@id='viewContact_fullName_sp']")).getText();
		System.out.println(contactName);
		String title = driver.getTitle();
		String expTitle = "View Contact | opentaps CRM";

		if (title.equals(expTitle)) {
		System.out.println("Title matched");
		} 
		else {
		System.out.println("Title not matched");
		}

	}
	
}
