package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithTestNG {

	private static WebDriver driver=null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeSuite
	public void SetUp()
	{
		htmlReporter= new ExtentHtmlReporter("extentReports.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	@BeforeTest
	public void SetUpTest()
	{

		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test1() throws Exception
	{

		ExtentTest test = extent.createTest("MyFirstTest ","Sample Description");
		driver.get("https://www.google.com");
		test.pass("Navigated to Google.com Home Page");
		test.log(Status.INFO,"This step shows usage of (status,details)");
		test.info("This step shows usage of info(details) ");
		test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");


	}

	@Test
	public void test2() throws Exception
	{
		ExtentTest test = extent.createTest("MyFirstTest ","Sample Description");
		test.log(Status.INFO,"This step shows usage of (status,details)");
		test.info("This step shows usage of info(details) ");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");


	}
	
	@AfterTest
	
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println(" Test Completed Successfully.......!!!!!!!!!! ");
		
	}
	

	@AfterSuite
	public void tearDown()
	{

		extent.flush(); 
	}

}
