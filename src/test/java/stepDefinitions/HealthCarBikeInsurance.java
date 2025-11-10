package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthCarBikeInsurance {
	
	@When("I click on car insurance tab")
	public void i_click_on_car_insurance_tab() 
	{
	   System.out.println("I click on car insurance tab");
	}

	@When("I provide Vehicle number,click on view quotes button")
	public void i_provide_vehicle_number_click_on_view_quotes_button() 
	{
	   System.out.println("I provide Vehicle number,click on view quotes button");
	}

	@When("I provide valid details and click on view quotes button")
	public void i_provide_valid_details_and_click_on_view_quotes_button() 
	{
		System.out.println("I provide valid details and click on view quotes button");
	}
	
	@Then("I should get plan details")
	public void i_should_get_plan_details() 
	{
	    System.out.println("I should get plan details");
	}

	@When("I click on bike insurance button")
	public void i_click_on_bike_insurance_button()
	{
	    System.out.println("I click on bike insurance button");
	}


}
