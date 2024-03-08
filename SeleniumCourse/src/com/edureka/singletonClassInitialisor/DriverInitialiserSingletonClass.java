package com.edureka.singletonClassInitialisor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialiserSingletonClass {

	public static WebDriver driver = null;
	public static String PropertyKey = "webdriver.chrome.driver";
	public static String DriverFilePath = "D:\\SeleniumCourse\\Drivers\\chromedriver.exe";
	
	public static void setProperty()
	{
		System.setProperty(PropertyKey, DriverFilePath);
	}
	public static WebDriver getDriver()
	{
		if(driver == null)
		{
			driver = new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		return driver;
	}
	
}
