package StepDefination;

import org.openqa.selenium.By;

import Utility.Base;
import io.cucumber.java.After;

public class hphds_Hooks extends Base{

	@After("@SeleniumTest")
	public void closeBrowser()
	{
		driver.findElement(By.id("ctl00_ucfrmCitizenMenu_LinkButton_Logout")).click();
		driver.findElement(By.name("ctl00$ucfrmCitizenMenu$Logout$btnRemoveYes")).click();
		driver.close();
	}
	
	@After("@PersonalDetailPageTest")
	public void closedBrowser()
	{
		driver.findElement(By.id("ctl00_ucfrmCitizenMenu_LinkButton_Logout")).click();
		driver.findElement(By.name("ctl00$ucfrmCitizenMenu$Logout$btnRemoveYes")).click();
		driver.close();
	}
	
	@After("@ApplicantAddress")
	public void closedBrowser1()
	{
		driver.findElement(By.id("ctl00_ucfrmCitizenMenu_LinkButton_Logout")).click();
		driver.findElement(By.name("ctl00$ucfrmCitizenMenu$Logout$btnRemoveYes")).click();
		driver.close();
	}

}
