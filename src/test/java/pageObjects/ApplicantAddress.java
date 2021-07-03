package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ApplicantAddress {

	public WebDriver driver;
	Select sel;
	By corresspondenceAddress=By.xpath("//h3[contains(text(),'Correspondence Address')]");
	By state=By.xpath("(//select[@title='Select state'])[1]");
	By district=By.xpath("(//select[@title='Select District'])[1]");
	By tehsil=By.xpath("(//select[@title='Select Tehsil'])[1]");
	By village=By.xpath("(//select[@title='Select Village'])[1]");
	By block=By.xpath("(//select[@title='Select Block'])[1]");
	By panchayat=By.xpath("(//select[@title='Select Panchayat'])[1]");
	By address=By.xpath("//textarea[@name='ctl00$ContentPlaceHolder_Middle$AddressControl$txtaddress']");
	By pincode=By.xpath("//input[@name='ctl00$ContentPlaceHolder_Middle$AddressControl$txtpincode']");

	public ApplicantAddress(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement verifyCorresspondenceAddress()
	{
		return driver.findElement(corresspondenceAddress);
	}

	//Correspondence Address
	public String verifyState(String State)
	{

		sel = new Select(driver.findElement(state));
		List<WebElement> ele =sel.getOptions();
		for(int i=0;i<ele.size();i++)
		{
			if(ele.contains("HIMACHAL PRADESH | हिमाचल प्रदेश"))
			{
				State=ele.get(i).getAttribute("value");
				break;
			}
		}
		return State;
	}


	public String verifyDistrict(String Dist)
	{

		sel = new Select(driver.findElement(district));
		List<WebElement> ele =sel.getOptions();
		for(int i=0;i<ele.size();i++)
		{
			if(ele.contains("HAMIRPUR | हमीरपुर"))
			{
				Dist=ele.get(i).getAttribute("value");
				break;
			}
		}
		return Dist;
	}


	public String verifyTehsil(String Tehsil)
	{

		sel = new Select(driver.findElement(tehsil));
		List<WebElement> ele =sel.getOptions();
		for(int i=0;i<ele.size();i++)
		{
			if(ele.contains("Nadaun  |  ऩादौन"))
			{
				Tehsil=ele.get(i).getAttribute("value");
				break;
			}
		}
		return Tehsil;
	}


	public String verifyVillage(String Village)
	{

		sel = new Select(driver.findElement(village));
		List<WebElement> ele =sel.getOptions();
		for(int i=0;i<ele.size();i++)
		{
			if(ele.contains("Nadaun  |  नादौन"))
			{
				Village=ele.get(i).getAttribute("value");
				break;
			}
		}
		return Village;
	}


	public String verifyBlock(String Block)
	{

		sel = new Select(driver.findElement(block));
		List<WebElement> ele =sel.getOptions();
		for(int i=0;i<ele.size();i++)
		{
			if(ele.contains("Nagar Panchayat Nadaun / नगर पंचायत नादौन"))
			{
				Block=ele.get(i).getAttribute("value");
				break;
			}
		}
		return Block;
	}


	public String verifyPanchayat(String Panchayat)
	{

		sel = new Select(driver.findElement(panchayat));
		List<WebElement> ele =sel.getOptions();
		for(int i=0;i<ele.size();i++)
		{
			if(ele.contains("Ward No. 1 - Hospital Ward / वार्ड नंबर 1 - अस्पताल वार्ड"))
			{
				Panchayat=ele.get(i).getAttribute("value");
				break;
			}
		}
		return Panchayat;
	}

	public String verifyAddress(String add)
	{
		return driver.findElement(address).getAttribute("value");
		
	}

	public String verifyPinCode(String pin)
	{
		return driver.findElement(pincode).getAttribute("value");
	}
}
