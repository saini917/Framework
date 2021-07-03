package StepDefination;


import java.util.List;
import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber; 


@RunWith(Cucumber.class)
public class hphds_LoginStepDefination {
	
	@Given("validate the browser")
	public void validate_the_browser() {
	    System.out.println("validate the browser");
	}
	@When("Brwoser is triggered")
	public void brwoser_is_triggered() {
	   System.out.println("Brwoser is triggered");
	}
	@Then("check if browser is started")
	public void check_if_browser_is_started() {
	    System.out.println("check if browser is started");
	}

	@Given("^User is on Application Dashboard$")
	public void user_is_on_application_dashboard() {
		
		System.out.println("User is on Application Dashboard");
	    
	}
	
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String arg1, String arg2) {
		System.out.println(arg1);
		System.out.println(arg2);
	    
	}
	
	@Then("^Application Dashboard is populated$")
	public void application_dashboard_is_populated() {
	    
		System.out.println("Application Dashboard is populated");
	}

	@Then("^click on new request button on the top of right hand side$")
	public void click_on_new_request_button_on_the_top_of_right_hand_side() {
	
		System.out.println("click on new request button on the top of right hand side");
	}
	
	@Then("^list of services displayed are \"([^\"]*)\"$")
	public void list_of_services_displayed_are(String string) {
	    
	}
	
	@When("^User sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data) {
		List<List<String>> obj=data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	   
	}
	
	
	@When("^User login in to application with username (.+) and password (.+)$")
	public void user_login_into_application_with_username_user1_and_password_pass1(String username, String password) {
		
		System.out.println(username);
		System.out.println(password );
	   
	}

}
