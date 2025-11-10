package com.covefox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {
	
	//variable--->webelement
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") 
	private WebElement matchingResult;
	
	//constructor
	public CoverFoxResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public String getMatchingResultNumber()
	{
		String result = matchingResult.getText();
		String[] Tresult = result.split(" ");
		String actualResult = Tresult[0];
		return actualResult;
	}
}
