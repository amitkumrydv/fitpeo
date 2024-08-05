package com.fitPeo.testCase;

import org.testng.annotations.Test;

import com.fitPeo.baseClass.BaseClass;
import com.fitPeo.pageObject.HomePageObject;
import com.fitPeo.pageObject.RevenueCalculatorPageObject;

public class HomePageTestCase extends BaseClass {
	

	@Test(priority = 1)
	public void validateTextToSlider() throws Exception {
		
		HomePageObject openHomepage = new HomePageObject(driver);
		openHomepage.navigateToHomePage();
		System.out.println("Home page opened");
		
		RevenueCalculatorPageObject  revenueCalculatorPageObject = new RevenueCalculatorPageObject(driver);
		
		
		revenueCalculatorPageObject.clickRevenueCalculater();
		
		revenueCalculatorPageObject.inputTextForSlider();

		
		
		
	}
	
	
	@Test(priority = 2)
	public void validateRecurringAmount() throws Exception {
		
		HomePageObject openHomepage = new HomePageObject(driver);
		openHomepage.navigateToHomePage();
		System.out.println("Home page opened");
		
		RevenueCalculatorPageObject  revenueCalculatorPageObject = new RevenueCalculatorPageObject(driver);
		
		
		revenueCalculatorPageObject.clickRevenueCalculater();
		
		revenueCalculatorPageObject.moveSlider();
		revenueCalculatorPageObject.clickCheckBoxes();
		revenueCalculatorPageObject.validateRecurringAmount();

		
		
		
	}
	
	
	
	

}
