package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import java.lang.Thread;

import com.edureka.singletonClassInitialisor.DriverInitialiserSingletonClass;

public class DragDropElementHandling {
	
	public static WebDriver driver = null;
	public static String DragDropWebPage = "http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html";
	public static void main(String args[])
	{
		DriverInitialiserSingletonClass.setProperty();
		driver = DriverInitialiserSingletonClass.getDriver();
		
		driver.get(DragDropWebPage);
		driver.manage().window().maximize();
		
		String srcXpath = "//h1[text()='Block 1']";
		WebElement src = driver.findElement(By.xpath(srcXpath));
		
		String destXpath = "//div[@id='column-3']";
		WebElement dest = driver.findElement(By.xpath(destXpath));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
		
		String sampleURL = "https://www.google.com/";
		driver.get(sampleURL);
		
		String textXPath = "//textarea[@class='gLFyf']";
		
		WebElement searchBox = driver.findElement(By.xpath(textXPath));
		
		Actions action1 = new Actions(driver);
		Action searchString = action1.keyDown(searchBox , Keys.SHIFT).sendKeys("Some Text").keyUp(searchBox, Keys.SHIFT).doubleClick().build();
		searchString.perform();
	}
	
}
