package Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Pages.GoogleSearchPageObjects;
import config.PropertiesFile;
public class GoogleSearchPageTestNGDemo2

{
	static WebDriver driver=null;
	public static String browserName=null; 
	
	@BeforeTest
	void setUpTest() 
	{   
		PropertiesFile.getProperties();
		String projectPath=	System.getProperty("user.dir");
		
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();	
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		    
			
	}
	
	 @Test
	public  void googleSearchTest3()
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
		PropertiesFile.setProperties();
	}
}
