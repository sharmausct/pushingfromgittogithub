package april17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Test Case
 * -----------
 * Launch browser
 * Open URL
 * validate title
 * close browser
 * 
 */


public class FirstTestCase {

	public static void main(String[] args) {
		
		//System.out.println("hi");
		
		// Launch browser
		WebDriver driver  = new ChromeDriver();
		//WebDriver driver  = new EdgeDriver();
		//WebDriver driver  = new FirefoxDriver();
	
		// Open URL
		
		driver.get("https://demo.opencart.com/");
		
		//validate title
		String pagetitle = driver.getTitle();
		
		if ( pagetitle.equals("Your Store")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail1"); 
		}
		
		//close browser
		driver.close();
		
		
	
	}

}
