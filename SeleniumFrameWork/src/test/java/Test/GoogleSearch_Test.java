/**
 * 
 */
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author AAswal
 *
 */
public class GoogleSearch_Test {
	
	
	public static void main(String[] args)
	{
		
		googleSearch();
		
	}
	
	public static void googleSearch()
	{
		//WebElement webElement = null ;
		//webElement.sendKeys(Keys.TAB);
		//webElement.sendKeys(Keys.ENTER);
		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test Completed Sucessfully");
		
	}

}
