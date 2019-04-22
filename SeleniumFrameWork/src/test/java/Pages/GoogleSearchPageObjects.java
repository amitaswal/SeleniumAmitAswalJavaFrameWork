package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleSearchPageObjects
{
	WebDriver driver=null;	
	By textbox_GoogleSearch=By.name("q");
	By button_Search=By.name("btnk");


	public GoogleSearchPageObjects(WebDriver driver) //will take the instance of WebDriver from the calling class
	{

		this.driver=driver;

	}


	public void setTextInSearchBox(String  text)
	{
		driver.findElement(textbox_GoogleSearch).sendKeys(text);

	}

	public void clickSearchButton() 
	{

		
		driver.findElement(button_Search).sendKeys(Keys.TAB);
		driver.findElement(button_Search).sendKeys(Keys.ENTER);
	}

}
