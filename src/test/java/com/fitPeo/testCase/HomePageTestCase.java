package com.fitPeo.testCase;

import org.testng.annotations.Test;

import com.fitPeo.baseClass.BaseClass;
import com.fitPeo.pageObject.HomePageObject;

public class HomePageTestCase extends BaseClass {
	
	
	
	@Test
	public void homePageNavigation() {
		
		HomePageObject openHomepage = new HomePageObject(driver);
		openHomepage.navigateToHomePage();
		System.out.println("Home page opened");
		
	}
	

}
