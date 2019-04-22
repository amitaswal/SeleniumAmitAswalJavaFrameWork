package utlis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider 
{  
	static WebDriver driver=null;

	@BeforeTest
	void setUpTest() 
	{   
		PropertiesFile.getProperties();
		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();	


	}

	@Test(dataProvider="test1data")
	public void test1(String username,String password) throws InterruptedException 
	{

		System.out.println(username+" | "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("username");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();

	}

	@DataProvider(name="test1data")
	public Object[][] getData()
	{
		String excelPath="C:\\Users\\aaswal\\eclipse-workspace\\SeleniumFrameWork\\excel\\data.xlsx";
		Object data[][]=testdata(excelPath, "Sheet1" ); 
		return data;

	}

	public static Object[][] testdata(String excelPath, String sheetName ) 
	{
		ExcelUtlis excel=new ExcelUtlis(excelPath, sheetName);
		int rowCount= ExcelUtlis.getRowCount();
		int ColCount= ExcelUtlis.getColCount();

		Object data[][]=new Object[rowCount-1][ColCount];

		for(int i=1;i<rowCount;i++) 
		{
			for(int j=0;j<ColCount;j++)
			{

				String cellData=	ExcelUtlis.getCellDataString(i, j);
				data[i-1][j]=cellData;

			}
		}
		return data;
	}
}
