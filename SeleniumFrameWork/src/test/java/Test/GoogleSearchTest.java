/**
 * 
 */
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPage; 
/**
 * @author AAswal
 *
 */
public class GoogleSearchTest {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args)
	{
		
		googleSearch();
		
	}
	
	public static void googleSearch()
	{
		
		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		GoogleSearchPage.testbox_search(driver).sendKeys("Automation Step by Step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("Test Completed Sucessfully");
		
	}

}
