package com.Flipkart.StepDefinition;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Flipkart.Pages.FlipkartMobilePages;
import com.Flipkart.Utility.ExcelDataConfig;
import com.Flipkart.Utility.Helper;
import com.Flipkart.Utility.PropFileReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlipkartMobileStepDefinition {

	public WebDriver driver;
	
	String priceofMobileinSearchPage=null;
	String TotalPrice=null;
	
	PropFileReader obj = new PropFileReader();
	Helper helper = new Helper(driver);
	
	FlipkartMobilePages page = new FlipkartMobilePages();
	
	ExcelDataConfig Dataobj = new ExcelDataConfig("TestData\\DataSheet.xlsx");
	
	@Given("^user is on Flipkart home page$")
	public void user_is_on_Flipkart_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Properties properties = obj.getProperty();
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(properties.getProperty("browser.baseURL"));
		PageFactory.initElements(driver, page);
		Assert.assertTrue(page.SearchBox.isDisplayed());
		

	}


	
	
	@And("^user enter search criteria$")
	public void user_enter_search_criteria() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		PageFactory.initElements(driver, page);
		page.closePopUpButton.click();
		PageFactory.initElements(driver, page);
		String criteria = Dataobj.getData(0, 0, 0);
		page.SearchBox.sendKeys(criteria);
		
		}
	
	@And("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		page.searchButton.click();
		
		}
	
	@Then("^validate mobile search screen is displayed$")
	public void validate_mobile_search_screen_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, page);
		
		helper.waitForElementTobeVisible(driver, page.PriceOfFirstMobile);
		 Assert.assertTrue(page.PriceOfFirstMobile.isDisplayed());
		
		}
	
	@And("^capture the price of first mobile$")
	public void capture_the_price_of_first_mobile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, page);
		
		priceofMobileinSearchPage=page.PriceOfFirstMobile.getText();
		
		}
	
	@And("^click on the first mobile$")
	public void click_on_the_first_mobile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, page);
		
		page.FirstMobile.click();
		
		}
	
	@And("^user click on Add to cart option$")
	public void Add_To_Cart() throws Throwable {
		String child_Window = null;
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, page);
		
		String mainWindow = driver.getWindowHandle();
		Set<String>s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			child_Window = it.next();
		}
		driver.switchTo().window(child_Window);
		page.AddToCart.click();
		
		}
	
	@And("^verify the total price with the previous search page price$")
	public void Verify_Cart_price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, page);
		  WebDriverWait wait = new WebDriverWait(driver,7);
		  wait.until(ExpectedConditions.visibilityOf( page.TotalPrice));
		  TotalPrice=page.TotalPrice.getText();
		  System.out.println("Total price is: "+TotalPrice);
		Assert.assertEquals(TotalPrice, priceofMobileinSearchPage);
		helper.killBrowser(driver);
		}
	
}
