package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)

public class TestNGListenerDemo 

{
	@Test
	public void test1()
	{

		System.out.println("I am inside Test1");	

	}

	@Test
	public void test2()
	{

		System.out.println("I am inside Test2");	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("abc")).sendKeys("Automation Step by Step");
		driver.close();
	}
	@Test
	public void test3()
	{

		System.out.println("I am inside Test3");	

	}

	@Test
	public void test4()
	{

		System.out.println("I am inside Test4");
		Assert.assertTrue(false);

	}

	@Test
	public void test5()
	{

		System.out.println("I am inside Test5");
		throw new SkipException("This Test is Skipped!!!");

	}
}
