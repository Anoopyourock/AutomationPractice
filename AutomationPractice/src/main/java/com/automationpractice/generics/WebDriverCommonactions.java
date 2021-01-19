package com.automationpractice.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class WebDriverCommonactions 
{

	
	public static void mouseAction(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	
	public static void mouse1Action(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).build().perform();
	}

	
	
	
}
