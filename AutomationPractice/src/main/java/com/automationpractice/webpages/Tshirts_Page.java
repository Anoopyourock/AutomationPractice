package com.automationpractice.webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.generics.WebDriverCommonactions;

public class Tshirts_Page
{
	WebDriver driver;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement Img;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement Addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']//span[1]")
	private WebElement Checkout;
	
	public Tshirts_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void ScrolltoTShirt()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Img);
	}
	
	public void MoveToTshirt()
	{
		
		WebDriverCommonactions.mouse1Action(driver, Img);
		
	}
	public void ClickonAddTocart()
	{
		Addtocart.click();
	}
	
	public void ClickonCheckOut()
	{
		Checkout.click();
	}
	
}
