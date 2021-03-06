package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultiBrowserDemo {
	String projectPath=	System.getProperty("user.dir");
	WebDriver driver=null;

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName ) 
	{
		System.out.println("The Browser name is:"+browserName);
		System.out.println("Thread id:"+Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}


		else if(browserName.equalsIgnoreCase("ie"))
		{

			System.setProperty("webdriver.ie.driver",projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.manage().window().maximize();
		}

	}



	@Test
	public void test1() throws InterruptedException 
	{

		driver.get("https://google.com"); 
		Thread.sleep(4000);

	}
	@AfterTest
	public void teardown() 
	{


		driver.close();
		System.out.println("Test Completed Successfully....");
	}



}
