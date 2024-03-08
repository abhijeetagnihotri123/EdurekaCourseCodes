package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadLessBrowserDemo {

	public static WebDriver driver = null;
	public static String PropertyKey = "webdriver.chrome.driver";
	public static String DriverFilePath = "D:\\SeleniumCourse\\Drivers\\chromedriver.exe";
	public static String sampleWebPageURL = "https://www.google.com";
	
	public static void main(String args[])
	{
		System.setProperty(PropertyKey, DriverFilePath);
		driver = new ChromeDriver();
		driver.get(sampleWebPageURL);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("TRex"); element.submit();
		 
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
