package com.automationpractice.generics;

import java.io.FileInputStream;
import java.util.Properties;



public class PropertyFileHandle 
{

	public static String getPropertyvalue(String key)
	{
		
	
	Properties p=new Properties();
	try 
	{
		p.load(new FileInputStream(AutoConstant.propertypath));
	} 
	catch (Exception e) 
	{
		
	}
	return p.getProperty(key);
	
}
	
}
