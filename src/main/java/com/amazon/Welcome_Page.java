package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {

	public static WebDriver driver;
	
	
	@FindBy(xpath="//select[@id=\"searchDropdownBox\"]")
	private WebElement category_Dropdown;
	
	public Welcome_Page(WebDriver driver2) {
       driver = driver2;
       PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCategory_Dropdown() {
		return category_Dropdown;
	}

	public WebElement getSearch_Bar() {
		return search_Bar;
	}
	

	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
	private WebElement search_Bar;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
}
