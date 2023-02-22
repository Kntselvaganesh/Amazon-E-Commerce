package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;
	
	@FindBy (xpath="//input[@name=\"email\"]")
	private WebElement email;
	
	@FindBy (xpath ="//input[@id=\"continue\"]")
	private WebElement continue_Btn;
	
	public Login_Page(WebDriver driver2) {
       driver = driver2;
       PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}
}
