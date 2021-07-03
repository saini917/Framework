package StepDefination;

import java.io.IOException;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utility.Base;
import Utility.DraftRequest;
import Utility.ProceedWithNewEntry;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.ApplicantAddress;
import pageObjects.ListOfServicesPage;
import pageObjects.NewRequestButon;
import pageObjects.PersonalDetailPage;

@RunWith(Cucumber.class)
public class AntiHaleNetStepDefinition {
	public WebDriver driver;
	NewRequestButon newRequest;
	ListOfServicesPage listOfService;
	PersonalDetailPage personalDetail;
	DraftRequest draft;
	ProceedWithNewEntry newEntry;
	ApplicantAddress address;

	@Given("^User is on List of service landing page$")
	public void user_is_on_list_of_service_landing_page() throws InterruptedException, IOException {
		driver = Base.getDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a/span[contains(text(),'Login/Signup')]")).click();
		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("deepaksaini");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hphds@123#");
		Thread.sleep(8000);
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(4000);

		newRequest=new NewRequestButon(driver);
		newRequest.ClickOnNewRequestButton().click();
	}
	@When("^User searched for \"([^\"]*)\" service$")
	public void user_searched_for_service(String serviceName) {

		listOfService= new ListOfServicesPage(driver);
		listOfService.searchService().sendKeys(serviceName);
		listOfService.clickOnSearchbutton().click();
	}
	@Then("^\"([^\"]*)\" result is displayed$")
	public void result_is_displayed(String serviceName) {
		listOfService= new ListOfServicesPage(driver);
		Assert.assertTrue(listOfService.compareServiceName().getText().contains(serviceName));
	}

	@Then("^click on service \"([^\"]*)\" name$")
	public void click_on_service_name(String serviceName) throws InterruptedException {
		listOfService= new ListOfServicesPage(driver);
		listOfService.clickOnSearchedServiceName().click();
		Thread.sleep(3000);

		//code for delete save as draft request

		/*draft = new DraftRequest(driver);
		if(draft.deleteRequest().isDisplayed())
		{
			draft.deleteRequest().click();
			draft.clickOnYes().click();
		}*/

		//on the save as draft pop up page click on proceed with new entry
		newEntry = new ProceedWithNewEntry(driver);
		newEntry.clickOnProceedWithNewEntry().click();
		Thread.sleep(3000);
	}
	@Then("^User is on \"([^\"]*)\" entry page$")
	public void user_is_on_entry_page(String pageName) {
		listOfService= new ListOfServicesPage(driver);
		Assert.assertTrue(listOfService.searchedServiceEntryPage().getText().contains(pageName));
	}


	//Personal detail Tab

	@Then("^User is Landing on Personal detail tab$")
	public void user_is_landing_on_personal_detail_tab() throws Throwable {
		personalDetail = new PersonalDetailPage(driver);
		String personalTab=personalDetail.verifyPersonalDetailTab().getText();
		Assert.assertEquals("Personal Details", personalTab);
	}

	@Then("^User enter with aadhar number (.+)$")
	public void user_enter_with_aadhar_number(String aadhar) throws InterruptedException 
	{
		personalDetail = new PersonalDetailPage(driver);
		personalDetail.verifyAadhaarNumber().sendKeys(aadhar);
		personalDetail.clickOnAnyBtn().click();
		Thread.sleep(2000);
		Assert.assertTrue(personalDetail.verifyAadhaarNumber().getAttribute("value").contains(aadhar));

	}

	@And("^User enter with emailid (.+)$")
	public void user_enter_with_emailid(String emailid) throws Throwable {
		personalDetail = new PersonalDetailPage(driver);
		personalDetail.verifyEmailID().sendKeys(emailid);
		Assert.assertTrue(personalDetail.verifyEmailID().getAttribute("value").contains(emailid));
	}

	@And("^User enter with udyan number (.+)$")
	public void user_enter_with_udyan_number(String udyanNumber) throws Throwable {
		personalDetail = new PersonalDetailPage(driver);
		personalDetail.verifyUdyanNumber().sendKeys(udyanNumber);
		Assert.assertTrue(personalDetail.verifyUdyanNumber().getAttribute("value").contains(udyanNumber));
	}


	@Then("^click on Next button$")
	public void click_on_next_button() {
		personalDetail = new PersonalDetailPage(driver);
		personalDetail.clickOnNextBtn().click();
	}
	@Then("^User move to the Applicant Address tab$")
	public void user_move_to_the_applicant_address() {
		personalDetail = new PersonalDetailPage(driver);
		String nextTab=personalDetail.verifyApplicantAddressTab().getText();
		Assert.assertEquals(nextTab, "Applicant Address");
	}
	
	//Applicant Address
	
	 @Then("^User verify the Correspondence address on the Applicant Address page$")
	    public void user_verify_the_correspondence_address_on_the_applicant_address_page() throws Throwable {
		 address = new ApplicantAddress(driver);
		 address.verifyCorresspondenceAddress();
		 Assert.assertEquals(address.verifyCorresspondenceAddress().getText(),"Correspondence Address");
	    }
	 
	 
//	 @Then("^User verify the state with \"([^\"]*)\"$")
//	    public void user_verify_the_state_with_something(String state) throws Throwable {
//	     String stat = state;
//		 address = new ApplicantAddress(driver);
//		Assert.assertEquals(address.verifyState("HIMACHAL PRADESH | हिमाचल प्रदेश"),stat);
//	    }
//
//	    @Then("^User verify the district with \"([^\"]*)\"$")
//	    public void user_verify_the_district_with_something(String district) throws Throwable {
//	    	String dist = district;
//			 address = new ApplicantAddress(driver);
//			Assert.assertEquals(address.verifyDistrict("HAMIRPUR | हमीरपुर"),dist); 
//	    }
//
//	    @Then("^User verify the tehsil with \"([^\"]*)\"$")
//	    public void user_verify_the_tehsil_with_something(String tehsil) throws Throwable {
//	    	String teh = tehsil;
//			 address = new ApplicantAddress(driver);
//			Assert.assertEquals(address.verifyTehsil("Nadaun  |  ऩादौन "),teh); 
//	    }
//
//	    @Then("^User verify the village with \"([^\"]*)\"$")
//	    public void user_verify_the_village_with_something(String village) throws Throwable {
//	    	String vill = village;
//			 address = new ApplicantAddress(driver);
//			Assert.assertEquals(address.verifyVillage("Nadaun  |  नादौन"),vill); 
//	    }
//
//	    @Then("^User verify the block with \"([^\"]*)\"$")
//	    public void user_verify_the_block_with_something(String block) throws Throwable {
//	    	String blk = block;
//			 address = new ApplicantAddress(driver);
//			Assert.assertEquals(address.verifyBlock("Nagar Panchayat Nadaun / नगर पंचायत नादौन"),blk);
//	    }
//
//	    @Then("^User verify the panchayat with \"([^\"]*)\"$")
//	    public void user_verify_the_panchayat_with_something(String panchayat) throws Throwable {
//	    	String panch = panchayat;
//			 address = new ApplicantAddress(driver);
//			Assert.assertEquals(address.verifyPanchayat("Ward No. 1 - Hospital Ward / वार्ड नंबर 1 - अस्पताल वार्ड"),panch);
//	    }
//
//	    @Then("^user verify the address with \"([^\"]*)\"$")
//	    public void user_verify_the_address_with_something(String Address) throws Throwable {
//	    	String Add=Address;
//	    	address = new ApplicantAddress(driver);
//	    	Assert.assertEquals(address.verifyAddress("Abc"),Add);
//	    }
//
//	    @Then("^User verift the pincode with \"([^\"]*)\"$")
//	    public void user_verift_the_pincode_with_something(String pincode) throws Throwable {
//	        String pinc=pincode;
//	    	address = new ApplicantAddress(driver);
//	    	Assert.assertEquals(address.verifyPinCode("174405"),pinc);
//	    }
	   

	 @Then("^User verify the state with (.+)$")
	    public void user_verify_the_state_with(String state) throws Throwable {
		 String stat = state;
		 address = new ApplicantAddress(driver);
		Assert.assertEquals(address.verifyState("HIMACHAL PRADESH"),stat);
	    }

	    @Then("^User verify the district with (.+)$")
	    public void user_verify_the_district_with(String district) throws Throwable {
	    	String dist = district;
			 address = new ApplicantAddress(driver);
			Assert.assertEquals(address.verifyDistrict("HAMIRPUR"),dist); 
	    }

	    @Then("^User verify the tehsil with (.+)$")
	    public void user_verify_the_tehsil_with(String tehsil) throws Throwable {
	    	String teh = tehsil;
			 address = new ApplicantAddress(driver);
			Assert.assertEquals(address.verifyTehsil("Nadaun"),teh); 
	    }

	    @Then("^User verify the village with (.+)$")
	    public void user_verify_the_village_with(String village) throws Throwable {
	    	String vill = village;
			 address = new ApplicantAddress(driver);
			Assert.assertEquals(address.verifyVillage("Nadaun"),vill); 
	    }

	    @Then("^User verify the block with (.+)$")
	    public void user_verify_the_block_with(String block) throws Throwable {
	    	String blk = block;
			 address = new ApplicantAddress(driver);
			Assert.assertEquals(address.verifyBlock("Nagar Panchayat Nadaun"),blk);
	    }

	    @Then("^User verify the panchayat with (.+)$")
	    public void user_verify_the_panchayat_with(String panchayat) throws Throwable {
	    	String panch = panchayat;
			 address = new ApplicantAddress(driver);
			Assert.assertEquals(address.verifyPanchayat("Ward No. 1 - Hospital Ward"),panch);
	    }

	    @Then("^user verify the address with (.+)$")
	    public void user_verify_the_address_with(String Address) throws Throwable {
	    	String Add=Address;
	    	address = new ApplicantAddress(driver);
	    	Assert.assertEquals(address.verifyAddress("Abc"),Add);
	    }

	    @Then("^User verift the pincode with (.+)$")
	    public void user_verift_the_pincode_with(String pincode) throws Throwable {
	    	String pinc=pincode;
	    	address = new ApplicantAddress(driver);
	    	Assert.assertEquals(address.verifyPinCode("174405"),pinc);
	    }

}








