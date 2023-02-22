package org.amazon.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_BaseClass {

public static WebDriver driver;
	
public static WebDriver browser_Launch(String Name) {
	if(Name.equals("chrome")) {
		System.setProperty("webDriver.chrome.driver","D:\\ECLIPSE WORKSPACE\\Selenium_Project\\DRIVER\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("incognito");
	driver = new ChromeDriver(options);
	}
	else if (Name.equals("edge")) {
		System.setProperty("webdriver.edge.driver", "D:\\ECLIPSE WORKSPACE\\Selenium_Project\\DRIVER\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("inprivate");
		driver = new EdgeDriver(options);
	}
	
	return driver;
}

//WEBELEMENT Commands

public static void url(WebDriver d, String url) {
   d.get(url);
}

public static void input(WebElement web, String value) {

	web.sendKeys(value);
}
//DROP DOWN COMMANDS
	
	public static void selectIndex(WebElement web , int i) {
     Select s = new Select(web);
     s.selectByIndex(i);
     
	}
	
	public static void selectvisibletext(WebElement web , String s) {
		Select s1 = new Select(web);
		
		s1.selectByVisibleText(s);
		
	}
	
	public static void selectvalue(WebElement web , String s) {
		Select s2 = new Select(web);
		
		s2.selectByValue(s);
	}
	
	
	// Alert Commands
	
	public static void accept(WebDriver d) {

		Alert a = d.switchTo().alert();
		a.accept();
		
	}
	
	public static void dismiss(WebDriver d) {
		
		Alert a1 = d.switchTo().alert();
		a1.dismiss();
	}
	
	// WINDOW COMMANDS
	
	public static void maxim(WebDriver d) {

		d.manage().window().maximize();
	}
	
	public static void minim(WebDriver d) {

		d.manage().window().minimize();
	}

     public static void close(WebDriver d) {
     
    	 d.close();
	}
     
     public static void quit(WebDriver d) {
    
    	 d.quit();
	}
     
     public static void fullscr (WebDriver d) {
    	 d.manage().window().fullscreen();
     }
     
     public static void click(WebElement web) {

    	 web.click();
	}
     
     //TAKE SCREEN SHOT METHOD
     
     public static void screenshot(WebDriver d , String s) throws IOException {

    	 TakesScreenshot ts = (TakesScreenshot) d;
    	 File src = ts.getScreenshotAs(OutputType.FILE);
    	 File des = new File(s);
    	 FileUtils.copyFile(src, des);
	}

     // JAVASCRIPT EXECUTOR METHOD
     
     public static void jsscroll(WebDriver d , WebElement web) {
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) d;
    	 
    	 js.executeScript("arguments[0].scrollIntoView()", web);
     }

     public static void jsclick(WebDriver d , WebElement web) {
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) d;
    	 
    	 js.executeScript("arguments[0].click()", web);
    	 
     }

     public static void jshighlight(WebDriver d, WebElement web) {
    	 JavascriptExecutor js = (JavascriptExecutor) d;
    	 js.executeScript("arguments[0].setAttribute('style',border:2px solid red; background:yellow')", web);

     }

     public static void movetoelem(WebDriver d , WebElement web) {

    	 Actions act = new Actions(d);
    	 act.moveToElement(web).build().perform();
	}
     
     public static void action_Click(WebDriver d , WebElement elem) {
         Actions act = new Actions(d);
         act.click(elem).build().perform();
	}
}
