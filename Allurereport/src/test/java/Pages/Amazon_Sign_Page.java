package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Helper_Browser.BrowserFactory;

public class Amazon_Sign_Page extends BrowserFactory{
	
 
	public Amazon_Sign_Page()
	{
		super(driver);
	}
	
	
	
	By username= By.xpath("//input[@id='ap_email']");
	
	
	By continueBtn= By.xpath("//input[@id='continue']");
	
	
	By password = By.xpath("//div[@class='a-section a-spacing-large']/child::input[@type='password']") ;
	
	
	By signin = By.xpath("//input[@id='signInSubmit' and @type='submit']") ;
	
	By createBtn = By.xpath("//a[@id='createAccountSubmit']");
	

	
	public WebDriver loginPage(String uname, String password1)
	{
		driver.findElement(username).sendKeys(uname);;
		
		driver.findElement(continueBtn).click();
		driver.findElement(password).sendKeys(password1);
		driver.findElement(signin).click();
	    //boolean createBtn = driver.findElement(continueBtn).isDisplayed();
	    //Assert.assertEquals(createBtn, "The continue Button is displayed");
		return driver;
	}
	
	

}
