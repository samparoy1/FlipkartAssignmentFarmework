package com.Flipkart.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

	private WebDriver driver;
	
	public Helper(WebDriver driver) {
		this.driver=driver;
	}
	
	public void waitForElementTobeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void killBrowser(WebDriver driver) {
		driver.quit();
	}
	
}
