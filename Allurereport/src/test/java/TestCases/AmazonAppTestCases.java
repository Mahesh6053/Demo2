package TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Helper_Browser.BrowserFactory;
import Pages.AddToCartPage;
import Pages.Amazon_Home_Page;
import Pages.Amazon_Sign_Page;
import Pages.ItemSelectionPage;
import Pages.ProceedToBuyPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class AmazonAppTestCases extends BrowserFactory{
	
	public AmazonAppTestCases()
	{
		super(driver);
	}
	
	@Test(priority=0)
	@Description("Verify the Browser Setup")
	@Epic("Ep001")
	@Feature("Feature1: Browser")
	@Story("Story: Browser setup")
	@Step("Verify Browser setup")
	@Severity(SeverityLevel.CRITICAL)
	public void setBrowserrr()
	{
		BrowserFactory.browser("chrome", "http://tiny.cc/h271vz");
		String Expectedtitle = "Amazon.in";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(Expectedtitle, ActualTitle, "The expected url is not similar as Actual \n"+Expectedtitle+"\nActualTitle: "+ActualTitle);	
	}
	
	
	
	@Test(priority=2)
	@Description("Verify the Login Page")
	@Epic("Ep003")
	@Feature("Feature3: LoginPage")
	@Story("Story: Verif the presence of login page")
	@Step("Verify login")
	@Severity(SeverityLevel.BLOCKER)

	public void verifyLoginPage()
	{
		Amazon_Sign_Page asp = new Amazon_Sign_Page();
		asp.loginPage("9505590751", "Mahesh@123");
	}
	
	@Test(priority=3)
	@Description("Verify home page")
	@Epic("Ep004")
	@Feature("Feature4: Homepage")
	@Story("Story: Verify the presence of home page")
	@Step("Verify Homepage")
	@Severity(SeverityLevel.CRITICAL)

	public void verifyHomePage()
	{
		Amazon_Home_Page ahp = new Amazon_Home_Page();
		ahp.searchItem("iphone");
		
	}
	
	
	@Test(priority=4)
	@Description("Verify item is selected or not")
	@Epic("Ep005")
	@Feature("Feature5: Homepage")
	@Story("Story: Verify the presence of item")
	@Step("Verify Itemselection")
	@Severity(SeverityLevel.CRITICAL)
	public void selectitem()
	{
		ItemSelectionPage isp = new ItemSelectionPage();
		isp.item1();
	}
	
	@Test(priority=5)
	@Description("Verify item is added to cart or not")
	@Epic("Ep006")
	@Feature("Feature5: Homepage")
	@Story("Story: Verify the presence of item")
	@Step("Verify addToCart")
	@Severity(SeverityLevel.CRITICAL)
	public void addcart()
	{
		AddToCartPage act = new AddToCartPage();
		act.cartInfo();
	}
	
	@Test(priority=6)
	@Description("Verify item is selected or not")
	@Epic("Ep007")
	@Feature("Feature7: Whitelist page")
	@Story("Story: Verify the presence of item")
	@Step("Verify item purchasing")
	@Severity(SeverityLevel.CRITICAL)
	public void proceedtoBuy()
	{
		ProceedToBuyPage ptb = new ProceedToBuyPage();
		ptb.ProceedToBuyPage1();
	}
	
	@Test(priority=7)
	@Description("Verify test is skipped or not")
	@Epic("Ep008")
	@Feature("Feature8: skip")
	@Story("Story: Verify skip operation")
	@Step("Verify skip operation")
	@Severity(SeverityLevel.NORMAL)
	public void skip()
	{
		throw new SkipException("skip this exception");
		
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("work completed!!, happily we close the browser");
		//driver.quit();
	}
	
}
