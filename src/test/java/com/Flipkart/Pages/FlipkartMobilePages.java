package com.Flipkart.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlipkartMobilePages {

	@FindBy(how=How.XPATH, using="//input[@placeholder='Search for products, brands and more']")
	@CacheLookup
	public WebElement SearchBox;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/button")
	@CacheLookup
	public WebElement closePopUpButton;
	
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	@CacheLookup
	public WebElement searchButton;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Showing 1 – 24 of 11,364 results for ')]")
	@CacheLookup
	public WebElement SearchResult;
	
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'REDMI 9i (Sea Blue, 64 GB)')]//parent::div//parent::div//following-sibling::div/div/div/div")
	@CacheLookup
	public WebElement PriceOfFirstMobile;
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'REDMI 9i (Sea Blue, 64 GB)')]")
	@CacheLookup
	public WebElement FirstMobile;
	
	@FindBy(how=How.XPATH, using="//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	@CacheLookup
	public WebElement AddToCart;
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/span/div/div/span")
	@CacheLookup
	public WebElement TotalPrice;
	
	
	
	
	
}
