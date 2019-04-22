import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesClassDemo {

	public static void main(String[] args) {
		
		//DesiredCapabilities caps= new DesiredCapabilities();
		//caps.setCapability("ignoreProtectedModeSetting", true);
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		capabilities.setCapability(InternetExplorerDriver.
		INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		
		
		String projectPath=	System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.i.driver",projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		WebDriver  driver= new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();

	}

}
