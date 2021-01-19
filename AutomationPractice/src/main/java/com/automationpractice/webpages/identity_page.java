package com.automationpractice.webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class identity_page
{
	public WebDriver driver;
	@FindBy(id="firstname")
	private WebElement FirstName;
	
	@FindBy(id="lastname")
	private WebElement Lastname;
	
	@FindBy(id="old_passwd")
	private WebElement oldpassword;
	
	@FindBy(id="passwd")
	private WebElement newpassword;
	
	@FindBy(id="confirmation")
	private WebElement confirmation;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement Save;
	
	public identity_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void EnterFirstName(String name)
	{JavascriptExecutor js=(JavascriptExecutor)(driver);
	js.executeScript("arguments[0].scrollIntoView(true);", FirstName);
		FirstName.sendKeys(name);
	}
	
	public void Enterlastname(String lastname)
	{
		Lastname.sendKeys(lastname);
	}
	
	public void EnterOldpassword(String old)
	{
		oldpassword.sendKeys(old);
	}
	
	public void EnterNewPassowrd(String newpass)
	{
		newpassword.sendKeys(newpass);
	}
	public void Confirmationpassword(String confirm)
	{
		confirmation.sendKeys(confirm);
	}
	
	public void ClickonSave()
	{
		
		Save.click();
	}
	
	
}
