package HomeAssignmentweek3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		      //implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.ajio.com/");
			driver.findElement(By.name("searchVal")).sendKeys("bags"+Keys.ENTER);
			driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//span[text()='category']/following::label[contains(text(),'Fashion Bags')]"));
			 Thread.sleep(2000);
			 
			 List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
			 System.out.println("FashionBags Brand Name:");
			 for(int i=0; i<brands.size(); i++) {
					String text = brands.get(i).getText();
					System.out.println(text);
				}
				System.out.println();
				//get list of bag names and print
						List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
						System.out.println("BagsName:");
						for(int i=0; i<bagNames.size(); i++) {
							String text = bagNames.get(i).getText();
							System.out.println(text);
						}
					


			}

		
	}


