package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	
WebDriver driver;
	
	//create constructor for storing current instances
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@type='password']");
	By loginbtn = By.name("login");
	
	public void username1()
	{
		try {
			driver.findElement(username).sendKeys("9505590751");
		}
		catch(Exception e)
		{
			System.out.println("lnvalid username");
		}
	}
	
	public void password1()
	{
		try {
			driver.findElement(password).sendKeys("mahesh@123");
		}
		catch(Exception e)
		{
			System.out.println("invalid password");
		}
	}
	
	

	public void verifyLoginbtn() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(loginbtn).click();
		}
		catch(Exception e)
		{
			System.out.println("login failed");
		}
		
	}
	

}
