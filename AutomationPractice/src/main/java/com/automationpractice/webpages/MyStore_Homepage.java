package com.automationpractice.webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.generics.WebDriverCommonactions;

public class MyStore_Homepage 
{
	WebDriver driver;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement TShirt; 
	
	
	
	
	public MyStore_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void ClickonTshirt()
	{
		WebDriverCommonactions.mouse1Action(driver, TShirt);
	}
	
	
	
}
