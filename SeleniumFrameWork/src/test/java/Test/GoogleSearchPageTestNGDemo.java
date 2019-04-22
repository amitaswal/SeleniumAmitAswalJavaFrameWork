package Test;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTestNGDemo
{
	static WebDriver driver=null;
	
	@BeforeTest
	void setUpTest() 
	{
		    String projectPath=	System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();	
	}
	
	 @Test
	public  void googleSearchTest()
	 {
		driver.get("https://www.google.com/");
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		searchPageObj.setTextInSearchBox("Automation Step by Step");
		searchPageObj.clickSearchButton();
	 }
	@AfterTest
	public void tearDown() 
	{
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
