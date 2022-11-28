package Pages;

import org.openqa.selenium.By;
import Helper_Browser.BrowserFactory;

public class Amazon_Home_Page extends BrowserFactory{
	
	
	
	public Amazon_Home_Page()
	{
		super(driver);
	}
	
	By searchBar = By.xpath("//div[@class='nav-search-field ']/child::input[@id='twotabsearchtextbox']");
	
	By searchIcon = By.xpath("//span[@id='nav-search-submit-text']/child::input[@type='submit']");
	
	public void searchItem(String search)
	{
		driver.findElement(searchBar).sendKeys(search);
		driver.findElement(searchIcon).click();
		
	}

}
