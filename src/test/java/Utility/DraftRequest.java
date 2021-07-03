package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DraftRequest {

	public WebDriver driver;

	By delete =By.xpath("//table[@class='table tbgrid']/tbody/tr/td/input[@id='ctl00_ContentPlaceHolder_Middle_grddraftsavepopup_ctl02_ltrDeleteDraftSave']");
	By yes = By.xpath("(//input[@value='Yes'])[2]");

	public DraftRequest(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public WebElement deleteRequest()
	{
		return driver.findElement(delete);

	}
	public WebElement clickOnYes()
	{
		return driver.findElement(yes);

	}
}
