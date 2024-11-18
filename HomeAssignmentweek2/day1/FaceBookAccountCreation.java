package HomeAssignmentweek2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FaceBookAccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/ ");
			driver.manage().window().maximize();
		      //implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("Dummy");
			driver.findElement(By.name("lastname")).sendKeys("Tummy");
			driver.findElement(By.name("reg_email__")).sendKeys("dummytummy123@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Goodmorning@12");
			WebElement daydropdown = driver.findElement(By.id("day"));
			//create a object for Date dropdown
			Select opt= new Select(daydropdown);
			opt.selectByValue("24");
			WebElement monthdropdown = driver.findElement(By.id("month"));
			//create a object for month dropdown
			Select obj= new Select(monthdropdown);
			obj.selectByValue("5");
			WebElement yeardropdown = driver.findElement(By.id("year"));
			//create a object for year dropdown
			Select object= new Select(yeardropdown);
			object.selectByValue("1999");
			driver.findElement(By.xpath("//input[@value='2']")).click();
			driver.findElement(By.name("websubmit")).click();		
			
	}

}
