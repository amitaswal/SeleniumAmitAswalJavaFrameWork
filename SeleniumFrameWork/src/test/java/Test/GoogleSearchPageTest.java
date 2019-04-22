package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest
{
	static WebDriver driver=null;
	public static void main(String[] args) 
	{
		googleSearchTest();

	}


	public static void googleSearchTest()

	 {
		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		searchPageObj.setTextInSearchBox("Automation Step by Step");
		searchPageObj.clickSearchButton();
		driver.close();
	
	 }
}
