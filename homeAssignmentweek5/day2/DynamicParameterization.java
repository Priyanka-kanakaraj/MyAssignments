package homeAssignmentweek5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends ProjectDynmaicMethod {
	@DataProvider(name="getData")
	public String[] setValue(){
		String name[]={"Vishnu","priya"};
		return name;
	}
@Test(dataProvider="getData")
	public  void Dynamic(String name)throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='slds-r4']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//lightning-button[@variant='base']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='slds-input'])")).sendKeys("legal Entities");
		driver.findElement(By.xpath("//a[@data-label='Legal Entities']//p[@class='slds-truncate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		WebElement legalname= driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
		legalname.sendKeys("Salesforce Automation by priya");
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
		//verify the legal name displaying
		String legalName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("Legal name: "+legalName);	
	}

}
