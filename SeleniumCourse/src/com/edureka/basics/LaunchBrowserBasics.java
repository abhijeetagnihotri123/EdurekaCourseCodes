package com.edureka.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserBasics {

	public static WebDriver driver = null;
	
	public static String PropertyKey = "webdriver.chrome.driver";
	public static String DriverFilePath = "D:\\SeleniumCourse\\Drivers\\chromedriver.exe";
	public static String sampleWebPageURL = "https://www.facebook.com/";
	
	public static void main(String args[])
	{
		System.setProperty(PropertyKey , DriverFilePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(sampleWebPageURL);
		
		String browserID = driver.getWindowHandle();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Browser ID "+browserID);
		driver.close(); // closes the current instance of the driver
		driver.quit(); // quits the browser
		
	}
	
}
