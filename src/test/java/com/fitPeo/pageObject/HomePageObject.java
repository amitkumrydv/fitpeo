package com.fitPeo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {

	public HomePageObject(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	

	By homepage = By.xpath("//a[@href='/home']//div[contains(text(),'Home')]");
	

}
