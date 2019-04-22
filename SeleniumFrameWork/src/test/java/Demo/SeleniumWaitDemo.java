package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {


	public static void main(String[] args) 
	{

		seleniumWaits();


	}

	public static void seleniumWaits() 
	{

		String projectPath=	System.getProperty("user.dir");
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Attached to the driver.
		//keeps checking for the element after every 250 milliseconds (polling) till 10 minutes.
		//if the element is found within the TimeFrame the action is performed.
		//if the element is not found the system throws an exception No Such Element found.
		 
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("ABC")));
		
		
		
		//Explicit wait can be set for specific element can be set for specific condition 
		// eg. wait until element is clickable.
		
		
		
		 
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.name("abcd")).click();
		driver.close(); 
		driver.quit();
	}

}
