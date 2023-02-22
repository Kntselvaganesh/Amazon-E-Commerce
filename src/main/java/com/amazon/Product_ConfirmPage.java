package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_ConfirmPage {
	
	public static WebDriver driver ;
	
	@FindBy(xpath="(//input[@type='submit'])[32]")
	private WebElement prod_Size;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement prod_Cart;

	public Product_ConfirmPage(WebDriver driver2) {
    
		driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getProd_Size() {
		return prod_Size;
	}

	public WebElement getProd_Cart() {
		return prod_Cart;
	}
	


}
