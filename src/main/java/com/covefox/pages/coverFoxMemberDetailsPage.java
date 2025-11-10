package com.covefox.pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.coverfox.utils.Utility;


public class coverFoxMemberDetailsPage 

{
		//variable-->webelements
	
		@FindBy(id = "Age-You") private WebElement ageDropDown;
		@FindBy(className = "next-btn") private WebElement NextButton;
		
		//Constrcutor 
		public coverFoxMemberDetailsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods
		public void handleAgeDropDown(String age) throws EncryptedDocumentException, IOException
		{
			
			Utility.handleDropDwonByVisibleText(ageDropDown," "+age+" years ");
					
		}
		public void clickOnNextButton()
		{
			NextButton.click();
			System.out.println("Clicling on Next Button  ");
		}
	
		

}
