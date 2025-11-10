package assertionStudy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword {
//  @Test (invocationCount = 2)
//  public void f() {
//	  
//	  WebDriver driver=new ChromeDriver();
//			  driver.get("https://www.amazon.com/");
//  }
	@Test (priority=-1)
	public void login()
	{
		Reporter.log("login test", true);;
	}
	@Test (priority=0)
	public void signIN()
	{
		Reporter.log("signin test", true);
	}
	@Test (priority=2)
	public void payment()
	{
		Reporter.log("payment test", true);
	}
	@Test (enabled =true)
	public void test()
	{
		Reporter.log("check test", true);
	}
	@Test (timeOut = 3000)
	public void test1() throws InterruptedException
	{
		Thread.sleep(4000);
		Reporter.log("timeout test", true);
	}
}
