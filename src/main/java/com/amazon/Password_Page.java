package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password_Page {
	public static WebDriver driver;

	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	private WebElement signin_Btn;
	
	public Password_Page(WebDriver driver2) {
        driver = driver2;
        PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
}
