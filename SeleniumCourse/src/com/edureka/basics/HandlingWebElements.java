package com.edureka.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.edureka.singletonClassInitialisor.DriverInitialiserSingletonClass;

public class HandlingWebElements {

	public static WebDriver driver = null;
	public static String sampleWebPageURL = "https://demo.automationtesting.in/Register.html";
	public static String AlertWebPageURL = "https://demo.automationtesting.in/Alerts.html";
	
	public static void main(String args[])
	{
		DriverInitialiserSingletonClass.setProperty();
		driver = DriverInitialiserSingletonClass.getDriver();
		driver.get(sampleWebPageURL);
		driver.manage().window().maximize(); 
		String firstNameXpath = "//input[@placeholder='First Name']";
		WebElement firstNamePlaceHolder = driver.findElement(By.xpath(firstNameXpath));
		firstNamePlaceHolder.sendKeys("Nathan");
		
		String MaleRadioButton = "//input[@value='Male']";
		WebElement MaleRadioButtonWebElement = driver.findElement(By.xpath(MaleRadioButton));
		MaleRadioButtonWebElement.click();
		
		String DropDownCountryid = "country";
		WebElement CountryDropDown = driver.findElement(By.id(DropDownCountryid));
		Select dropDownSelect = new Select(CountryDropDown);
		dropDownSelect.selectByIndex(5);
		
		
		driver.get(AlertWebPageURL);
		String infoAlerXpath = "//button[contains(text(),'display an')]";
		WebElement infoAlert = driver.findElement(By.xpath(infoAlerXpath));
		infoAlert.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		/*
		 * alert.dismiss() some other functions using alerts
		 * 
		 * 
		 *
		 */
		
		
		
		driver.quit();
	}
	
}
