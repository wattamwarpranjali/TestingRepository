package com.covefox.pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;



public class coverFoxAddressDetailspage 
{
		//Variable--->webelement
	
		@FindBy(className = "mp-input-text") private WebElement pincodeField;
		@FindBy(id = "want-expert") private WebElement mobileNoField;
		@FindBy(className = "next-btn") private WebElement contButton;
		@FindBy(xpath = "//div[contains(text(),'pincode')]") private WebElement pincodeErrorMsg; 
		@FindBy(xpath = "//div[contains(text(),'mobile')]") private WebElement mobErrorMsg; 
		//constructor
		public coverFoxAddressDetailspage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//Methods
		public void enterPinCode(String Pincode) throws EncryptedDocumentException, IOException
		{
			pincodeField.sendKeys(Pincode);
			System.out.println("Enter Pincode ");
		}
		public void enterMobileNumber(String mobnum) throws EncryptedDocumentException, IOException
		{
			mobileNoField.sendKeys(mobnum);
			System.out.println("Enter Mobile number");
		}
		public void clickOnContButton()
		{
			contButton.click();
			System.out.println("Clicking on next button ");
		}
		public String getPincodeErrorMsg()
		{
			return pincodeErrorMsg.getText();
		}
		public String getmobErrorMsg()
		{
			return mobErrorMsg.getText();
		}
	
	
}
