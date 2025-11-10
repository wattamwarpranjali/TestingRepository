package hooks;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.coverfox.driverConfig.DriverFactory;
import com.coverfox.utils.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	
	@Before
	public void launchBrowser() throws IOException
	{
		DriverFactory.initBrowser(Utility.readDataFromPropertiesFile("browser"));
	}
	@After(order=1)
	public void tearDown()
	{
		DriverFactory.getdriver().quit();
		Reporter.log("closing Browser", true);
	}
	@After(order=2)
	public static void takeScreenShot(Scenario scenario)
    {
    	boolean result = scenario.isFailed();
    			if(result)
    			{
    				byte[] ss = ((TakesScreenshot) DriverFactory.getdriver()).getScreenshotAs(OutputType.BYTES);
    				scenario.attach(ss,"image/png",scenario.getName());
    				Reporter.log("Taking screenshot", true);    			
    			}
    }

}
