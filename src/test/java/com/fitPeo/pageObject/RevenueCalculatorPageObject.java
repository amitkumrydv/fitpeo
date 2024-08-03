package com.fitPeo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RevenueCalculatorPageObject {

	public RevenueCalculatorPageObject(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	By revenueCalculater = By.xpath("//a[@href='/revenue-calculator']//div[contains(text(),'Revenue Calculator')]");
	
	// Scroll slider upto the value 820 take original
	By sliderBall =By.xpath(" //span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50']");
	
	// Enter the text value 560
	By textBoxBySlider = By.xpath(" //input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"); 
	
	// convert dynamic using loop
	By cptCard  = By.xpath(" //div[@class='MuiBox-root css-4o8pys']");
	
	// convert dynamic using loop [index value]
	By cptValue = By.xpath(" //div[@class='MuiBox-root css-4o8pys'][3]//p[contains(text(),'CPT')]");
	
	// convert dynamic using loop [index value]
	By checkbox = By.xpath("//div[@class='MuiBox-root css-4o8pys'][5]//label//span//input[@type='checkbox']");
	

	By totalRecurring = By.xpath("//div[@class='MuiBox-root css-m1khva']//following-sibling::p ");
	
	// Write the logic scroll the page until find the revenucalculator
	
	// Scenarios
	
	/*
	 * 1. Move slider upto 820 and verify the value in input text box
	 * 2. Enter the 560 in input text and verify the slider value
	
	
	
	*/
	
	
	

}
