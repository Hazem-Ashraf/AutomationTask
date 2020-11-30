package help;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginRegpage extends PageBase {

	public LoginRegpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//input[@id='email_create']")
	WebElement Emailadresstxt;
	
	@FindBy (id = "authentication")
	WebElement Emaillogintxt;
	
	@FindBy (id = "passwd")
	WebElement Passwdtxt;
	
	@FindBy (id = "SubmitCreate")
	WebElement Submitbtn;
	
	@FindBy (id = "SubmitLogin")
	WebElement Loginbtn;
	
	//////registration page
	@FindBy (id = ("email"))
	WebElement emailbtn;
	
	@FindBy (id = "id_gender1")
	WebElement genderbtn;
	
	@FindBy (id = "customer_firstname")
	WebElement firstntxt;
	
	@FindBy (id = "customer_lastname")
	WebElement lastntxt;
	
	@FindBy (id = "firstname")
	WebElement firstnametxt;
	
	@FindBy (id = "lastname")
	WebElement lastnametxt;
	
	@FindBy (id = "address1")
	WebElement adresstxt;
	
	
	@FindBy (id = "city")
	WebElement citytxt;
	
	@FindBy (id = "postcode")
	WebElement postcodetxt;
	
	
	@FindBy (id = "phone_mobile")
	WebElement mobilephonetxt;
	
	@FindBy (id = "alias")
	WebElement aliasadresstxt;
	
	@FindBy (id = "submitAccount")
	WebElement submitAccountbtn;
	
	////check out
	
	@FindBy (xpath = "//a[@title='T-shirts']")
	WebElement tshirtbtn;
	
	@FindBy (xpath = "//div[@class='product-image-container']")
	WebElement productbtn;
	
	
	
	
	public void userRReg (String email  ) {
		
		
		Emailadresstxt.sendKeys(email);
		Submitbtn.click();
		
		
		
	}
	public void userRegisteration(String firstname , String lastname , String password , String adress , String city , String postal , String phone , String aliasadress) {
		
		genderbtn.click();
		
		firstntxt.sendKeys(firstname);
		lastntxt.sendKeys(lastname);
		Passwdtxt.sendKeys(password);
		adresstxt.sendKeys(adress);
		citytxt.sendKeys(city);
		postcodetxt.sendKeys(postal);
		mobilephonetxt.sendKeys(phone);
		aliasadresstxt.sendKeys(aliasadress);	
		
	}
	
	public void userLogin(String loginemail , String loginpassowrd) {
		
		emailbtn.sendKeys(loginemail);
		Passwdtxt.sendKeys(loginpassowrd);
		Loginbtn.click();
		
	}
	
	
	
	
	

}
