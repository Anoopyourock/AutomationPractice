package com.automationpractice.webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page 
{
	WebDriver driver;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement SummaryProceedtoCheckOut;
			
	@FindBy(id="cgv")
	private WebElement checkbox;
	
	@FindBy(xpath="(//button[@type='submit']//span)[2]")
	private WebElement Shippingcheckout;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement Paybywire; 
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement Confirmorder;
	
	@FindBy(xpath="//div[@class='box']")
	private WebElement TeakeText;
	
	public Order_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void ScrolltoProceedtocheckout()
	{
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", SummaryProceedtoCheckOut);
	}
	
	public void Summary_Proceedtocheckout()
	{
		SummaryProceedtoCheckOut.click();
	}	
	
	
		
	public void ScroltoCheckbox()
	{
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
	}
	public void ShippingClickoncheckbox()
	{
		checkbox.click();
	}

	public void ClickonShippingcheckout()
	{
		Shippingcheckout.click();	
	}
	
	public void ScrolltoPayBywire()
	{
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Paybywire);
	}
	
	public void ClickonPayBywire()
	{
		Paybywire.click();
	}
	
	public void ScrolltoConfirmorder()
	{
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Confirmorder);	
	}
	public void ClickonConfirmorder()
	{
		Confirmorder.click();
	}
	
	public String Clickontext()
	{
		String t=TeakeText.getText();
		String l=t.substring(216,225);
		return l;
		
	}
	
}
