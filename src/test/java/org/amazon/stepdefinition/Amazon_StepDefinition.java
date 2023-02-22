package org.amazon.stepdefinition;


import org.amazon.baseclass.Amazon_BaseClass;
import org.amazon.runner.Amazon_Runner;
import org.openqa.selenium.WebDriver;

import com.amazon.Home_Page;
import com.amazon.Login_Page;
import com.amazon.Password_Page;
import com.amazon.Product_ConfirmPage;
import com.amazon.Product_Page;
import com.amazon.Welcome_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_StepDefinition extends Amazon_BaseClass {
	
	public static WebDriver driver = Amazon_Runner.driver;
	
	
	public static Home_Page home = new Home_Page(driver);
	public static Login_Page login = new Login_Page(driver);
	public static Password_Page pass = new Password_Page(driver);
	public static Welcome_Page welcome = new Welcome_Page(driver);
	public static Product_Page product = new Product_Page(driver);
	public static Product_ConfirmPage conf = new Product_ConfirmPage(driver);
	
	@Given("user Launch The Amazon Url")
	public void user_launch_the_amazon_url() {
       url(driver,"https://www.amazon.in/");	
       
       maxim(driver);
	   	}
	
	@When("user Move The Cursor into Signin Menu")
	public void user_move_the_cursor_into_signin_menu() {
		movetoelem(driver, home.getSignin());
	}
	@Then("user Click The Sign In button And It Navigate To Login Page")
	public void user_click_the_sign_in_button_and_it_navigate_to_login_page() {
		click(home.getSignin_Btn());
	}
	@When("user Enter The Email Id In The Email Or Mobile Number Field")
	public void user_enter_the_email_id_in_the_email_or_mobile_number_field() {
        input(login.getEmail(), "kntselvaganesh@gmail.com");
	}
	@Then("user Click The Continue button And It Navigate To Password Page")
	public void user_click_the_continue_button_and_it_navigate_to_password_page() {
		click(login.getContinue_Btn());
	}
	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
		input(pass.getPassword(), "Selenium@28");
	}
	@Then("user Click The Sign In button And It Navigate To The Next Page")
	public void user_click_the_sign_in_button_and_it_navigate_to_the_next_page() {
		click(pass.getSignin_Btn());
	}
	@When("user Click on Category Dropdown in Categore Dropdown")
	public void user_click_on_category_dropdown_in_categore_dropdown() {
        click(welcome.getCategory_Dropdown());
	}
	@When("user Select Clothing and Accessories in Category Dropdown")
	public void user_select_clothing_and_accessories_in_category_dropdown() {
	    selectvisibletext(welcome.getCategory_Dropdown(),"Clothing & Accessories");
	}
	@When("user Enter Sparx Men SS105 Slippers in the Search Bar")
	public void user_enter_sparx_men_ss105_slippers_in_the_search_bar() {
		input(welcome.getSearch_Bar(), "sparx men ss-105 slippers");
	}
	
	@Then("user Click The Search button And It Navigates To The Next Page")
	public void user_click_the_search_button_and_it_navigates_to_the_next_page()  {
	    click(welcome.getSearch());
	}
	@Then("user Click on Productc And It Navigates To The Next Page")
	public void user_click_on_productc_and_it_navigates_to_the_next_page()  {
	    click(product.getProduct());
	}
	@When("user Click The Size")
	public void user_click_the_size()throws InterruptedException  {
		Thread.sleep(5000);
      //  jsclick(driver, conf.getProd_Size());
		
		click(conf.getProd_Size());
		
	}
	@When("user Click The Add To Cart button")
	public void user_click_the_add_to_cart_button() {
		click(conf.getProd_Cart()); 
		
	}
	
	

}
