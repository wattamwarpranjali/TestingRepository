package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Reporter;

import io.cucumber.java.en.*;

public class GmailLogin {
	
	@Given("I am on Login page")
	public void i_am_on_login_page() {
	   Reporter.log("I am on login page", true);//works as SYSO ,true means show in console and in report
	}

	@When("I provide details and click on login button")
	public void i_provide_details_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable) 
	{
	   //reading table using list
		List<List<String>> testdata = dataTable.asLists();//we have list of list so we use this
		List<String> user1 = testdata.get(0);//get list of user1 data
		List<String> user2 = testdata.get(1);//get list of user2 data
		String userName1 = user1.get(0);//fetching user1 username
		String password2= user2.get(1);//fetching user2 password 
		Reporter.log("user1 username: "+userName1+"\n"+"user2 password: "+password2, true);
		System.out.println("==============================================================");
		
		//reading table with MAP
		List<Map<String, String>> testMapdata = dataTable.asMaps();
		 Map<String, String> userMap2 = testMapdata.get(1);//reading data with key and value pair
		System.out.println("user2 msg is: "+userMap2.get("msg"));
	}

	@Then("i should navigate to inbox")
	public void i_should_navigate_to_inbox() {
	    Reporter.log("i should navigate to inbox", true);
	}



}

