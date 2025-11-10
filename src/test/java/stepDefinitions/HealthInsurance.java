package stepDefinitions;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.covefox.pages.CoverFoxHealthPlanPage;
import com.covefox.pages.CoverFoxResultPage;
import com.covefox.pages.coverFoxAddressDetailspage;
import com.covefox.pages.coverFoxHomepage;
import com.covefox.pages.coverFoxMemberDetailsPage;
import com.coverfox.driverConfig.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthInsurance {

	
	coverFoxHomepage coverFoxHomepage=new coverFoxHomepage(DriverFactory.getdriver());
	CoverFoxHealthPlanPage coverHealthPlanPage=new CoverFoxHealthPlanPage(DriverFactory.getdriver());
	coverFoxMemberDetailsPage coverFoxMemberDetailsPage=new coverFoxMemberDetailsPage(DriverFactory.getdriver());
	coverFoxAddressDetailspage coverFoxAddressDetailspage=new coverFoxAddressDetailspage(DriverFactory.getdriver());
	CoverFoxResultPage coverFoxResultPage=new CoverFoxResultPage(DriverFactory.getdriver());
	SoftAssert softassert=new SoftAssert();
	
	@Given("I am on homepage")
	public void i_am_on_homepage() throws InterruptedException 
	{
	
	   System.out.println("I am on homepage");
	}

	@When("I click on getStarted button")
	public void i_click_on_get_started_button() throws InterruptedException
	{    
		Thread.sleep(5000);
		coverFoxHomepage.clickOnGetStartedButton();
	    System.out.println("I click on getStarted button");
	}

	@When("I click on Next button")
	public void i_click_on_next_button() throws InterruptedException
	{
		Thread.sleep(4000);
		coverHealthPlanPage.ClickOnNextButton(); 
	   System.out.println("I click on Next button");
	}

	@When("I provide age as {string},click on Next button")
	public void i_provide_age_as_click_on_next_button(String age) throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(4000);
		coverFoxMemberDetailsPage.handleAgeDropDown(age);
		coverFoxMemberDetailsPage.clickOnNextButton();
	    System.out.println("I provide age as "+age+",click on Next button");
	}

	@When("I provide pincode as {string},MobNum as {string}and click on continue button")
	public void i_provide_pincode_as_mob_num_as_and_click_on_continue_button(String pincode, String mobnum) throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(4000);
	    System.out.println("I provide pincode as "+pincode+",MobNum as" +mobnum+"and click on continue button");
	    coverFoxAddressDetailspage.enterPinCode(pincode);
	    coverFoxAddressDetailspage.enterMobileNumber(mobnum);
	    coverFoxAddressDetailspage.clickOnContButton();
	    //Assert.fail();//this is to chcek how failed step show in reporter file
	    
	}

	@Then("matching Health Insurance Plans should be displayed as {string}")
	public void matching_health_insurance_plans_should_be_displayed_as(String Expresult) throws InterruptedException 
	{
		Thread.sleep(6000);
	   System.out.println("matching Health Insurance Plans should be displayed as"+Expresult);
	   String actualresult = coverFoxResultPage.getMatchingResultNumber();
	   Reporter.log("Actual Result is:"+actualresult, true);
	   //instead of comparing exp and actual result in if else we use assersion
	   Assert.assertEquals(Expresult, actualresult);
	}

	@When("I click on continue button")
	public void i_click_on_continue_button() throws InterruptedException
	{
		Thread.sleep(4000);
	    coverFoxAddressDetailspage.clickOnContButton();
	   
	}

	@Then("Validate error msg")
	public void validate_error_msg() throws InterruptedException {
	    
		Thread.sleep(4000);
	   String actualpinerrormsg = coverFoxAddressDetailspage.getPincodeErrorMsg();
	   String actualmoberrormsg = coverFoxAddressDetailspage.getmobErrorMsg();
	   Reporter.log("pincode error msg is: "+actualpinerrormsg, true);
	   Reporter.log("Mob no error msg is: "+actualmoberrormsg, true);
	   String expErrMsgPin="Please enter a valid pincode";
	   String expErrMsgMob="Please enter a valid mobile no.";
	   softassert.assertEquals(actualpinerrormsg, expErrMsgPin,"pincode error msg is not matching");
	   Reporter.log("pin error msg validation is complete", true);
	   softassert.assertEquals(actualmoberrormsg, expErrMsgMob,"mob error msg is not matching");
	   Reporter.log("mob error msg validation is complete", true);
	   softassert.assertAll();
	}
	
	@Given("I login to application")
	public void i_login_to_application() {
	    System.out.println("I login to application");
	}
	
	

	


}
