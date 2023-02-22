package org.amazon.runner;

import java.time.Duration;

import org.amazon.baseclass.Amazon_BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\org\\amazon\\feature\\amazon.feature" ,
glue = "org.amazon.stepdefinition",

  monochrome = true, dryRun = false, publish = true, plugin =
  {"html:Report/rep.html","pretty"})
 
public class Amazon_Runner  {
	
	  public static WebDriver driver;
	  
	  @BeforeClass
	  
	  public static void start() {
	  
	  driver = Amazon_BaseClass.browser_Launch("chrome");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  }
	  
	  @AfterClass public static void exit() { driver.close(); }
	 
}