package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

	public static WebDriver driver;
	
@FindBy(xpath="(//div[@class=\"a-section aok-relative s-image-tall-aspect\"]//child::img[contains(@alt,'Athletic and Outdoor Sandals')])[1]")
private WebElement product;


public Product_Page(WebDriver driver2) {
   driver = driver2;
   PageFactory.initElements(driver,this);
}

public static WebDriver getDriver() {
	return driver;
}

public WebElement getProduct() {
	return product;
}
}
