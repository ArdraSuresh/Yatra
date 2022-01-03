/**
 * 
 */
package com.Yatra.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * @author ardra
 *
 */
public class BaseClass {
	public WebDriver driver;
	
    @BeforeMethod
	public void setup() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ardra\\Downloads\\chromedriver_win32//chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.yatra.com/");
    	driver.manage().window().maximize();
	}
	
    @AfterMethod
	public void tearDown() {
		driver.close();
	}
}
