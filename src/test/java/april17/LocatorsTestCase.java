package april17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
				WebDriver driver  = new ChromeDriver();
								
				driver.get("https://demo.opencart.com/");
				driver.manage().window().maximize();
				
				//name
				WebElement wb1 = driver.findElement(By.name("search"));
				wb1.sendKeys("Mac");
				
				//id
				boolean logodisplay = driver.findElement(By.id("logo")).isDisplayed();
				
				System.out.println(logodisplay);
				
				//linktext
				
				//driver.findElement(By.linkText("iPhone")).click();
				
				//partial link text
				
				//driver.findElement(By.partialLinkText("iPho")).click();
				
				
				
				
				//class
				
				List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
				
				System.out.println(headerlinks.size());
				
				//tag
				
				List<WebElement> links = driver.findElements(By.tagName("a"));
				
				System.out.println(links.size());
				
				
				List<WebElement> images = driver.findElements(By.tagName("img"));
				
				System.out.println(images.size());
				
				
				
				
				

	}

}
