package HomeAssignmentweek2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
	      //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on Click and confirm Title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(5000);
	   // Verify the title of the page
	            String pageTitle = driver.getTitle();
	            if (pageTitle.equals("Dashboard")) {
	                System.out.println("Title verified successfully. Title is: " + pageTitle);
	            } else {
	                System.out.println("Title verification failed. Title is: " + pageTitle);
	            }
	           //Navigate to previous page
	            driver.navigate().back();
	            boolean value = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
	            if(value)
	    			System.out.println("the button is enabled");
	    		else
	    			System.out.println("the button is disabled");
	            //Position of submit button
	            System.out.println("position of submit button  is "+driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
	            //Bg color of save button
	            System.out.println("Background of savebutton  is "+driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
	            //Height and width 
	            System.out.println("height and width is "+driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']//following::span")).getSize());
	    		driver.close();
}
}