package Pages;

import org.openqa.selenium.By;
import Helper_Browser.BrowserFactory;


public class ItemSelectionPage extends BrowserFactory{
	
	
	public ItemSelectionPage()
	{
		super(driver);
	}
	
	By item = By.xpath("//span[.='Apple iPhone 14 128GB Blue']");
	
	
	By wantedItem = By.xpath("//span[.='Apple iPhone 14 128GB Blue' and @class='a-truncate-cut']");
	
	public void item1()
	{
		driver.findElement(wantedItem).click();;
		
	}
	
}
