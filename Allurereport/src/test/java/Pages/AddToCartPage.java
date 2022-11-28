package Pages;

import org.openqa.selenium.By;
import Helper_Browser.BrowserFactory;

public class AddToCartPage extends BrowserFactory{
	
	public AddToCartPage()
	{
		super(driver);
	}
	
	By AddToCart = By.xpath("//span[@class='a-button-inner']/child::input[@id='add-to-cart-button']");
	
	By gotoCart = By.xpath("//span[@class='a-button-inner']/child::input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']");
	
	public void cartInfo()
	{
		try {
			driver.findElement(AddToCart).click();
			driver.findElement(gotoCart).click();
		}
		catch(Exception e)
		{
			System.out.println("Element not found or clickable exception"+e.getMessage());
		}
		
	}
	

}
