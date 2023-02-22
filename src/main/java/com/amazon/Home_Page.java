package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public static WebDriver driver;

	@FindBy(xpath="//a[@id=\"nav-link-accountList\"]")
	private WebElement signin;

	@FindBy(xpath="//span[@class=\"nav-action-inner\"]")
    private WebElement signin_Btn;

	public Home_Page(WebDriver driver2) {
    driver = driver2;
    PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

}
