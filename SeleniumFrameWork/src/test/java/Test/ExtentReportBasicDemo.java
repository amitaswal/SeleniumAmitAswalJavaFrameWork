package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest; 
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {

	private static WebDriver driver=null; 
	public static void main(String[] args)
	{
		// creating html reporter object and passing the html report path to it 
		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("extentReports.html");

		//create ExtentReports and attach reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		//create a toggle for the given test,adds all log event under it

		ExtentTest test1 = extent.createTest("Google Search Test One","This Test validate google search functionality ");
		
		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();	
		test1.log(Status.INFO,"Starting TestCase");
		driver.get("https://www.google.com");
		test1.pass("Navigated to Google.com  ");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in Search");
		//driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		test1.pass("Pressed KeyBoard enter Key");
		driver.close();
		driver.quit();
		test1.pass("Close the Browser");
		test1.pass("Test Completed");
		
		//Calling flush writes everything to the log file
		 extent.flush(); 
          
	}
}