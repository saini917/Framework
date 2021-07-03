package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfServicesPage {
	public WebDriver driver;
	By searchBox=By.name("ctl00$ContentPlaceHolder_Middle$txtSearch");
	By searchButton=By.xpath("//input[@type='submit' and @value='Search']");
	By compareServiceName=By.xpath("//a[@title='Please Click for Proceed']");
	By clickOnSearchedServiceName=By.xpath("//a[@title='Please Click for Proceed']");
	By serviceEntryPage=By.xpath("//p[@class='h4 ml-1 mr-2']");
	
	public ListOfServicesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement searchService()
	{
		return driver.findElement(searchBox);
	}
	
	public WebElement clickOnSearchbutton()
	{
		return driver.findElement(searchButton);
	}
	
	public WebElement compareServiceName()
	{
		return driver.findElement(compareServiceName);
	}
	
	public WebElement clickOnSearchedServiceName()
	{
		return driver.findElement(clickOnSearchedServiceName);
	}
	
	public WebElement searchedServiceEntryPage()
	{
		return driver.findElement(serviceEntryPage);
	}

}
