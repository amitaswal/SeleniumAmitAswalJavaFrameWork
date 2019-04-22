package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser 
{
	
	public static void main(String[] args) 
	{
		
	test();	
		
	}

	public static void test() 
	{
		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-s=1366,786");
		
		WebDriver driver =new ChromeDriver(options);
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
	    //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    driver.close();
	    driver.quit();
	    System.out.println("The test is Completed!!!!!!!!!!!!!");
	}
	
}
