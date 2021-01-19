package com.automationpractice.webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.generics.WebDriverCommonactions;

public class MyAccount 
{
	WebDriver driver;
	@FindBy(xpath="//a[@title='View my customer account']")
	private WebElement ViewMyAccount;

	@FindBy(xpath="//span[text()='Order history and details']")
	private WebElement Orderhistory;
	
	@FindBy(xpath="//tr[@class='first_item ']/td[1]")
	private WebElement OrderRefrence;
	
	@FindBy(linkText="Sign in")
	private WebElement SignIn;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement EmailId;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath="(//button[@type='submit']//span)[3]")
	private WebElement SignIn1;
	
	@FindBy(xpath="//span[text()='My personal information']")
	private WebElement MyPersonalInformation;
	
	public MyAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void clickonMyAccount()
	{
		WebDriverCommonactions.mouse1Action(driver, ViewMyAccount);
		ViewMyAccount.click();
	}
	
	public void ClickOnOrderHistory()
	{
		Orderhistory.click();
	}
	
	public String OrderRefrencetext()
	{
		return OrderRefrence.getText();
	}
	
	public void ClickOnSignin()
	{
		SignIn.click();
	}
	public void ScrolltoEmail()
	{
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", EmailId);
	}
	
	public void EnterEmailID()
	{
		//String Username=GetExcelData.readexceldata("Sheet1", 1, 0);
		EmailId.sendKeys("advik@gmail.com");
		
	}
	
	public void EnterPassword()
	{
		Password.sendKeys("1234567");
	}
	
	public void ClickonSignIninorder()
	{
		SignIn1.click();
	}
	public void ClickOnMyPersonalInformation()
	{
		MyPersonalInformation.click();
	}


}
