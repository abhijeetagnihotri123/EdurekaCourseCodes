package com.edureka.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.edureka.singletonClassInitialisor.DriverInitialiserSingletonClass;

public class TestSingletonClass {
	
	public static String sampleWebPageURL = "https://www.google.com";
	public static WebDriver driver = null;
	public static void main(String args[])
	{
		DriverInitialiserSingletonClass.setProperty();
		driver = DriverInitialiserSingletonClass.getDriver();
		driver.get(sampleWebPageURL);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("TRex"); element.submit();
		 
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
