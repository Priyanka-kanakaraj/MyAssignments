package homeAssignmentweek5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod {
@Test
	public void Sales()  throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='slds-r4']/following-sibling::div[1]")).click();
	driver.findElement(By.xpath("//lightning-button[@variant='base']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='slds-input'])")).sendKeys("legal Entities");
	driver.findElement(By.xpath("//a[@data-label='Legal Entities']//p[@class='slds-truncate']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@title='New']")).click();
	WebElement name= driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
	name.sendKeys("Salesforce Automation by priya");
    driver.findElement(By.xpath("//button[text()='Save']")).click();
	//verify the legal name displaying
	String legalName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
	System.out.println("Legal name: "+legalName);	
}	
	}

