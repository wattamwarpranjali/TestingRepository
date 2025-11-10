package assertionStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
  @Test
  public void actualResult()
  {
	  Reporter.log("actual Result", true);
	  
  }
  @Test
  public void Expectedresult()
  {
	  Reporter.log("Expected Result", true);
  }
  @BeforeMethod
  public void AddressDetails()
  {
	  Reporter.log("Provide pincode and mob result", true);
  }
  @AfterMethod
  public void clearHistory()
  {
	  Reporter.log("clearing the history", true);
  }
  @BeforeClass
  public void memberdetails()
  {
	  Reporter.log("providing age ", true);
  }
  @AfterClass
  public void teardown()
  {
	 Reporter.log("quiting browser", true);
  }
  @BeforeTest
  public void beforetest()
  {
	  Reporter.log("Before Test", true);
  }
  @AfterTest
  public void aftertest()
  {
	  Reporter.log("After test", true);
  }
  @BeforeSuite
  public void beforesuit()
  {
	  Reporter.log("before suit", true);
  }
  @AfterSuite
  public void aftersuit()
  {
	  Reporter.log("After suit", true);
  }
}
