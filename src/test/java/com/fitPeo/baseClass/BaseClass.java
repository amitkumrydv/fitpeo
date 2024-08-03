package com.fitPeo.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	
	
	public void lounchBrowser() {
		
		
		// Auto download the chrome Driver
		WebDriverManager.chromedriver().setup();
		
        ChromeOptions  disbaleEvent =  new ChromeOptions();  // Disbled unexpected event occure while lounching chrome browser
		
		driver = new ChromeDriver(disbaleEvent);  
		
		disbaleEvent.addArguments("--disable-extensions"); // Disable extensions
		
		disbaleEvent.addArguments("--disable-web-security"); // Disable webSecurity
		disbaleEvent.addArguments("--ignore-certificate-errors"); // ignore certificate error.
		disbaleEvent.addArguments("--disable-popup-blocking");
		
		driver.get("https://www.fitpeo.com/"); // hit the url on the browser
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
