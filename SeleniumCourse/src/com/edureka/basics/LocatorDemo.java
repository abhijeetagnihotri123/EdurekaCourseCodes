package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorDemo {

	public static WebDriver driver = null;
	public static String PropertyKey = "webdriver.chrome.driver";
	public static String DriverFilePath = "D:\\SeleniumCourse\\Drivers\\chromedriver.exe";
	public static String sampleWebPageURL = "https://www.facebook.com/";
	public static String sampleXPath = "//input[@name='email' or @value='2928']";
	
	public static void main(String args[])
	{
		System.setProperty(PropertyKey , DriverFilePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(sampleWebPageURL);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("GuiltySpark343@UNSC.com");
		
		
		/*
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		 
		 */
		
//		WebElement fname = driver.findElement(By.className("Some class name for CSS selector"));
//		fname.sendKeys("Some Text");
		
		/*
		 * List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		 * for(WebElement webelement : allLinks) {
		 * System.out.println(webelement.getText()); }
		 */
		
		//finding elements using xpath
		WebElement xpathElement = driver.findElement(By.xpath(sampleXPath));
		xpathElement.sendKeys("Xpath Element");
		
		
	}
}
