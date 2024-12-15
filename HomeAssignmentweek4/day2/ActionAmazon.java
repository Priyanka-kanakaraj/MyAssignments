package HomeAssignmentweek4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionAmazon {

	public static void main(String[] args) throws InterruptedException, IOException  {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	      //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//In search box, check for mobile
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s24 ultra 5g mobile");
		//click on search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement price= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String value = price.getText();
		System.out.println("Price of mobile phone is: "+value);
		WebElement rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		String val= rating.getText();
		System.out.println("Customer Rating is:"+val);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(@class,'a-size-medium')]/span")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1)); // Switch to the child window
		String childTitle = driver.getTitle();
		System.out.println("window title is:" + driver.getTitle());
		File scr= driver.getScreenshotAs(OutputType.FILE);
		File trg= new File("./snapshot/takeSnap.png");
		FileUtils.copyFile(scr, trg);
		//Add to card
		 WebElement cart= driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
         // Use JavaScriptExecutor to scroll the element into view
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);", cart);
         cart.click();
         Thread.sleep(2000);
         WebElement sub= driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
         String subtotal=sub.getText();
         if(value==subtotal)
         {
        	 System.out.println("Cart Subtotal:");
         }
        	 else {
        		 System.out.println("Cart Subtotal: " + subtotal);
         }
         
         driver.quit();

	
	}

}
