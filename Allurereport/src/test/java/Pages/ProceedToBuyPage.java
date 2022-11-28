package Pages;

import org.openqa.selenium.By;
import Helper_Browser.BrowserFactory;

public class ProceedToBuyPage extends BrowserFactory{
	
	 
	
	public ProceedToBuyPage()
	{
		super(driver);
	}
	
	By checkBox = By.xpath("//input[@id='sc-buy-box-gift-checkbox' and @type='checkbox']");
	By proceedToBuy = By.xpath("//span[@class='a-button-inner']//child::input[@name='proceedToRetailCheckout']");
	
	public void ProceedToBuyPage1()
	{
		try {
		driver.findElement(checkBox).click();
		driver.findElement(proceedToBuy).click();
		}
		catch(Exception s)
		{
			System.out.println("elementent not found so not clickable at proceed to buy page");
		}
		driver.quit();
	}
	

}
