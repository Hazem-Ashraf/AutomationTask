package com.maven.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class TestBase {
	public static WebDriver driver;

	@BeforeMethod
	public void StartDriver () {

		String chromepath = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver",chromepath );
		driver = new ChromeDriver();
		
		
		 
		
	    
		

		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
		//driver.manage().window().maximize();

	}

	@AfterMethod
	public void CloseDriver() {

		driver.quit();
	}
	
	@AfterMethod
	public void screenShot(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
		System.out.println("Take screenshot");
		ScreenShots.GetScreenshot(driver, result.getName());
		}
		
	}
}
