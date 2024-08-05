package com.fitPeo.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.fitPeo.utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static ReadConfig readConfig = new ReadConfig();

	public String baseURL = readConfig.getApplicationURL();
	
	protected static WebDriver driver;


	@BeforeClass
	public WebDriver lounchBrowser() throws InterruptedException {
		
		
		// Auto download the chrome Driver
		WebDriverManager.chromedriver().setup();
		
        ChromeOptions  disbaleEvent =  new ChromeOptions();  // Disbled unexpected event occure while lounching chrome browser
		
		driver = new ChromeDriver(disbaleEvent);  
		
		disbaleEvent.addArguments("--disable-extensions"); // Disable extensions
		
		disbaleEvent.addArguments("--disable-web-security"); // Disable webSecurity
		disbaleEvent.addArguments("--ignore-certificate-errors"); // ignore certificate error.
		disbaleEvent.addArguments("--disable-popup-blocking");
//		
		
		driver.get(baseURL); // hit the url on the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		return driver;
		
	}
	
	
	
	
	@AfterClass
	
	public void quit() {
		
		driver.quit();
	}
	
	
	

}
