package com.Yatra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Yatra.base.BaseClass;


public class HomePage extends BaseClass{
	public WebDriver driver;
	
	@FindBy(xpath="//label[@for='BE_flight_origin_city']")
	WebElement From;
	@FindBy(xpath="//input[contains(@class, 'ac_input origin_ac')]")
	WebElement FromCity;
	@FindBy(xpath="//input[contains(@class, 'ac_input dest_ac')]")
	WebElement ToCity;
	@FindBy(xpath="//input[contains(@class,'search-btn')]")
	WebElement Search;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public BookingPage search() {
		From.click();
		FromCity.sendKeys("BLR");
		ToCity.sendKeys("DEL");
		Search.click();
		return new BookingPage();
	}

}
