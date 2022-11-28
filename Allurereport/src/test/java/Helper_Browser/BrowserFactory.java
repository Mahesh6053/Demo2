package Helper_Browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
    public static WebDriver driver;
   public  BrowserFactory(WebDriver driver)
   {
	  BrowserFactory.driver = driver; 
   }
	
	public static WebDriver browser(String Browser, String url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("driver="+driver);
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			System.out.println("driver="+driver);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
			System.out.println("Browser not found");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		return driver;
		
	}

}
