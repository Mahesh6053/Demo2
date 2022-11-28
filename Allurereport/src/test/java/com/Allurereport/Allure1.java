package com.Allurereport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allure1 {
	
	public WebDriver driver;

	@BeforeTest
	public void setBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tiny.cc/h271vz");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(driver);
	}

	@Test(priority=0)
	public void Verifylogin() {

		WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("9505590751");

		WebElement cbtn = driver.findElement(By.xpath("//input[@id='continue']"));
		cbtn.click();

		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Mahesh@123");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		loginBtn.click();

	}

	@Test(priority=1)
	public void HomePage() {
		WebElement searchBar = driver
				.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.click();
		searchBar.sendKeys("iphone");

		WebElement searchIcon = driver
				.findElement(By.xpath("//span[@id='nav-search-submit-text']/child::input[@type='submit']"));
		searchIcon.click();

		String title = driver.getTitle();

		String Actualtitle = "Amazon.in : iphone";

		Assert.assertEquals(title, Actualtitle);

	}

	@Test(priority=2)
	public void ItemSelection() {
		WebElement item = driver
				.findElement(By.xpath("//span[.='Apple iPhone 14 128GB Blue' and @class='a-truncate-cut']"));
		item.click();
		String text = item.getText();
		String Actualtext = "Apple iPhone 14 128GB Blu";
		Assert.assertEquals(text, Actualtext, "The Actual test is not same as expected\nActual Text: "+Actualtext+"\nExpected: "+text+"\n");

	}
	
	@Test(priority=3)
	public void selectitem() 
	{
		throw new SkipException("skip this test"); 
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
