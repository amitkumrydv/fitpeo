package com.fitPeo.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fitPeo.baseClass.BaseClass;

public class HomePageObject extends BaseClass {

	public HomePageObject(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


	
	@FindBy(xpath ="//a[@href='/home']")
	@CacheLookup
	protected WebElement homepageElement;
	
	
	
	
	public void navigateToHomePage() throws InterruptedException {

		
		homepageElement.click();
		Thread.sleep(5000);

	}

}
