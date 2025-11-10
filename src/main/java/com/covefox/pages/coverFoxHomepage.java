package com.covefox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverFoxHomepage
{
	
	//variable--->webelement
	//@findby is the annotation
	@FindBy(xpath = "//button[text()='Get Started']") private WebElement getStartedButton;

	
	//constrcutor
	
	public coverFoxHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//methods
	public void clickOnGetStartedButton()
	{
		getStartedButton.click();
		System.out.println("Clicking on get started Button");
	}
	
	
}
