package homeAssignmentweek5.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SalesforceAdd extends ProjectSpecificMethod {
	@Test
	public void Salesforce() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-r4']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//lightning-button[@variant='base']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@class='slds-input'])")).sendKeys("legal Entities");
		driver.findElement(By.xpath("//a[@data-label='Legal Entities']//p[@class='slds-truncate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		//WebElement name= driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
		//name.sendKeys("Salesforce Automation by priya");
		WebElement cmpyname= driver.findElement(By.xpath("(//input[@part='input'])[3]"));
		cmpyname.sendKeys("TestLeaf");
	    driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
	    WebElement status= driver.findElement(By.xpath("//label[text()='Status']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", status);
        status.click();
	    WebElement active = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']"));
		active.click();
		 WebElement submit= driver.findElement(By.xpath("//button[text()='Save']"));
		 submit.click();
		 Thread.sleep(2000);
		  String error=driver.findElement(By.xpath("//h2[text()='We hit a snag.']/following::a")).getText();
		 System.out.println(error);		  
		 if(error.contains("Entity Name"))
		    	System.out.println("legal name is mandatory");
		    else
		    	System.out.println("no alert message");    
	}
}
