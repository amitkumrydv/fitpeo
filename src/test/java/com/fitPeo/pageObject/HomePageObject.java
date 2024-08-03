package com.fitPeo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fitPeo.baseClass.BaseClass;

public class HomePageObject extends BaseClass{

	public HomePageObject(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	

	By homepageElement = By.xpath("//a[@href='/home']//div[contains(text(),'Home')]");
	
	
	public void navigateToHomePage() {
		
		WebElement homepage = driver.findElement(homepageElement);
		
		homepage.click();
		
	}

}
