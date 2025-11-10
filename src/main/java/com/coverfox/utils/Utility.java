package com.coverfox.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import webDriverMethod.WebdriverMethods;

public class Utility {

	
		//screenshot
		//ScrollIntoView
		
		//Excel sheet
		//Screenshot
		
		public static void getScreenShot(WebDriver driver,String ScreenShotName) throws IOException
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String timestamp=new SimpleDateFormat("MM-dd-YYYY_HH-mm-ss").format(new Date());
			String path = System.getProperty("user.dir");
			File dest=new File(path+"/screenshot1/"+ScreenShotName+"_"+timestamp+".png");
			System.out.println("Screen shot name is: "+ScreenShotName);
			System.out.println("Taking screen shot and saving at location... "+dest);
			FileHandler.copy(source, dest);
			
		}
		public static void ScrollIntoView(JavascriptExecutor driver,WebElement webelement)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0] scrollIntoView(true)", webelement);
			System.out.println("Scrolling into View.."+webelement.getText());
			
		}
		public static void waitForElement(WebDriver driver,long waitTime, WebElement webelement)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(waitTime));
			wait.until(ExpectedConditions.visibilityOf(webelement));
			System.out.println("Waiting for element for :"+waitTime);
		}
	
		public static String readDataFromExcel(int row,int cell,String Sheet) throws EncryptedDocumentException, IOException
		{
			FileInputStream myfile=new FileInputStream("/Users/amarwattamwar/Desktop/PRACTICE SQL/test data.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet(Sheet);
			String testdata = mysheet.getRow(row).getCell(cell).getStringCellValue();
			System.out.println("Reading data from excel: "+testdata);
			return testdata;
		}
		public static String readDataFromPropertiesFile(String key) throws IOException
		{
			Properties properties=new Properties();
			FileInputStream myfile=new FileInputStream("/Users/amarwattamwar/eclipse-workspace/CoverFoxnew/src/main/resources/config/config.properties");
			properties.load(myfile);
			String value = properties.getProperty(key);
			return value;
		}
		
		public static void handleDropDwonByVisibleText(WebElement element,String visibletext)
		{
			Select select=new Select(element);
			select.selectByVisibleText(visibletext);
			System.out.println("handling dropdown by visible text... value is "+visibletext);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
 