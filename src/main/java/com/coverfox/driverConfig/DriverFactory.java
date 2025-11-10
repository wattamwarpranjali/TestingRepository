package com.coverfox.driverConfig;

import java.io.IOException;

import javax.xml.stream.XMLReporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.coverfox.utils.Utility;

public class DriverFactory {
	
	static WebDriver driver;
	public static WebDriver initBrowser(String BrowserName) throws IOException
	{
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) 
		{
			
		driver=new FirefoxDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(Utility.readDataFromPropertiesFile("url"));
		return driver;
	}
	public static WebDriver getdriver()
	{
		return driver;
	}

}
