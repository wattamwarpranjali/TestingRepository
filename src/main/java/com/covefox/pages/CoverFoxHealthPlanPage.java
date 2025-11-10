package com.covefox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage 
{
		//Encapsulations in POM classes
		//Variable-->WebElements
		@FindBy(className = "next-btn") private WebElement nextButtonElement;
		
		//Constructor
		
		public CoverFoxHealthPlanPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//Methods
		public void ClickOnNextButton()
		{
			nextButtonElement.click();
			System.out.println("Clicking on Next Button");
		}
}
