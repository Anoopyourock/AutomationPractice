package com.automationpractice.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import com.automationpractice.generics.PropertyFileHandle;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	public static WebDriver driver;

	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cp = new ChromeOptions();
		cp.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cp.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.get(PropertyFileHandle.getPropertyvalue("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	public void Close_Browser()
	{
		driver.close();
	}
	

}
