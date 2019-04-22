import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserTest {

	public static void main(String[] args) 
	{

		String projectPath=	System.getProperty("user.dir");
		//System.out.println("projectPath :"+projectPath);
		// System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		//driver.manage().window().maximize();
		//System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");


		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		/*try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/





		// DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		// System.setProperty("webdriver.ie.driver",projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.seleniumhq.org/");
		driver.get("https://www.google.com/");
		//WebElement textbox=   driver.findElement(By.name("q"));
		WebElement textbox=   driver.findElement(By.xpath("//input[@name='q']"));
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		 
		List<WebElement> listofinputelements= driver.findElements(By.xpath("//input"));
		int count= listofinputelements.size();
		System.out.println("Count of the input elements:"+count);
		
		
		textbox.sendKeys("Automation Step by Step");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	   //driver.quit();

	}

}
