package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProceedWithNewEntry {
	
	public WebDriver driver;
	
	By newRequestEntry=By.xpath("//input[@value='Proceed with New Entry']");
	
	public ProceedWithNewEntry(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickOnProceedWithNewEntry()
	{
		return driver.findElement(newRequestEntry);
	}

}
