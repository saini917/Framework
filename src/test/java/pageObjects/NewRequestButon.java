package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewRequestButon {

	public WebDriver driver;
	By newRequestButton=By.id("ctl00_ucfrmCitizenMenu_LinkButton_NewRequest");

	public NewRequestButon(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement ClickOnNewRequestButton()
	{
		return driver.findElement(newRequestButton);
	}
}
