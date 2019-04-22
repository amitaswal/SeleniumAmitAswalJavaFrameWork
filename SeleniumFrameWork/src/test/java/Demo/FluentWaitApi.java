package Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitApi 
{

	/*Fluent Wait is a interface defines the maximum amount 
	of time for a condition,as well as the frequency with which to check the condition*/
	
	/*
	 * Apply wait to specific element
	 * Set max wait time period
	 * Set polling frequency
	 * Set to ignore specific exception.
	 * 
	 * */
	 
	public static void main(String[] args) throws InterruptedException
	{
		
		test();
		
		
	}
	
	
	public static void test() throws InterruptedException 
	
	{
		

		String projectPath=	System.getProperty("user.dir");
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Abcd");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.linkText("ABCD: Any Body Can Dance - Wikipedia")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(30, TimeUnit.SECONDS)
	             .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);

	      WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	      public WebElement apply(WebDriver driver) {
	      WebElement linkElment=driver.findElement(By.linkText("ABCD: Any Body Can Dance -Wikipedia"));	
	    
	    if(linkElment.isEnabled())
	    {
	    	System.out.println("Element Found");
	    	
	    	
	    }
	    return linkElment;
	    
	     }
	   });
		
		Thread.sleep(5000);
		
		driver.close(); 
		driver.quit();
		
		
		
	}
	
	
	
}
