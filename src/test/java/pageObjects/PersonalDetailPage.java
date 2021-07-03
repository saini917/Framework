package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalDetailPage {

	public WebDriver driver;
	
	By personalDetailTab=By.xpath("//a[contains(text(),'Personal Details')]");
	By AadhaarNumber=By.name("ctl00$ContentPlaceHolder_Middle$BasicDetails$txtaadharNo");
	By EmailId=By.name("ctl00$ContentPlaceHolder_Middle$BasicDetails$txtEmailID");
	By udyancard=By.name("ctl00$ContentPlaceHolder_Middle$BasicDetails$txtUdyancardno");
	By nextBtn=By.name("ctl00$ContentPlaceHolder_Middle$Button_next");
	By clickonany=By.id("ctl00_ContentPlaceHolder_Middle_BasicDetails_MarkAadhaar");
	By applicantAddress=By.xpath("//a[contains(text(),'Applicant Address')]");

	public PersonalDetailPage(WebDriver driver)
	{
		this.driver= driver;
	}

	public WebElement verifyPersonalDetailTab()
	{
		return driver.findElement(personalDetailTab);
	}

	public WebElement verifyAadhaarNumber()
	{
		return driver.findElement(AadhaarNumber);

	}
	public WebElement verifyEmailID()
	{
		return driver.findElement(EmailId);
	}
	public WebElement verifyUdyanNumber()
	{
		return driver.findElement(udyancard);
	}
	
	public WebElement clickOnNextBtn()
	{
		return driver.findElement(nextBtn);
	}
	
	public WebElement clickOnAnyBtn()
	{
		return driver.findElement(clickonany);
	}
	
	public WebElement verifyApplicantAddressTab()
	{
		return driver.findElement(applicantAddress);
	}

}
