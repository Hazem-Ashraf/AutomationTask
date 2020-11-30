package com.maven.selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import help.LoginRegpage;

public class TestCase extends TestBase {

	//LoginRegpage UserR;

	@Test(priority = 1)
	public void userSuccesregistration () {
		System.out.println("xx");
		LoginRegpage UserR = new LoginRegpage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("authentication")));
		} catch (Exception e) {
			fail();
		}
		UserR = new LoginRegpage(driver);
		UserR.userRReg("hazem@ha4567zem.com");
		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("customer_firstname")));
		} catch (Exception e) {
			fail();
		}
		UserR.userRegisteration("hazem", "ashraf", "Asd123!@#" , "NY" , "banha" , "12345" , "0123456788" , "bty banha");

		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("California");

		Select Country  = new Select(driver.findElement(By.id("id_country")));
		Country.selectByVisibleText("United States");

		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='account']/span")));
		} catch (Exception e) {
			fail();
		}
		WebElement account = driver.findElement(By.xpath("//a[@class='account']/span"));
		assertEquals(account.getText(),"hazem ashraf" );

	}


	@Test(priority = 2)	
	public void userSucceslogin() {

		LoginRegpage UserR = new LoginRegpage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("authentication")));
		} catch (Exception e) {
			fail();
		}

		UserR.userLogin("hazem@ha1122zem.com", "Asd123!@#" );

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='account']/span")));
		} catch (Exception e) {
			fail();
		}
		WebElement account = driver.findElement(By.xpath("//a[@class='account']/span"));
		assertEquals(account.getText(),"hazem ashraf" );

	}

	@Test(priority = 3)	
	public void userCheckout() {

		LoginRegpage UserR = new LoginRegpage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("authentication")));
		} catch (Exception e) {
			fail();
		}

		UserR.userLogin("hazem@ha1122zem.com", "Asd123!@#" );

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='account']/span")));
		} catch (Exception e) {
			fail();
		}
		WebElement account = driver.findElement(By.xpath("//a[@class='account']/span"));

		assertEquals(account.getText(),"hazem ashraf" );

		wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='T-shirts'])[2]")));
		} catch (Exception e) {
			fail();
			System.out.println("err" + e);
		}
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='product-image-container']")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("//div[@class='product-image-container']")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@name='Submit']")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("//button[@name='Submit']")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@title='Proceed to checkout']")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@title='Proceed to checkout'])[2]")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@name='processAddress']")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@name='processCarrier']")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@title='Pay by bank wire']")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='cart_navigation']/button[@type='submit']")));
		} catch (Exception e) {
			fail();
		}
		driver.findElement(By.xpath("//p[@id='cart_navigation']/button[@type='submit']")).click();

		wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='center_column']//strong[@class='dark']")));
		} catch (Exception e) {
			fail();
		}

		WebElement complete = driver.findElement(By.xpath("//div[@id='center_column']//strong[@class='dark']"));

		assertEquals(complete.getText(),"Your order on My Store is complete." );




	}






}
