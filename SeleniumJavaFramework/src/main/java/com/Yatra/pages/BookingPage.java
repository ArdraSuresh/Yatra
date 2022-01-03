package com.Yatra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Yatra.base.BaseClass;

public class BookingPage extends BaseClass{
	
	@FindBy(xpath="//div[@id='BLRPNQ6E528SA20220104PNQDEL6E2369SA20220104_6EAPI']//div[contains(@class,'pr tipsy ')]")
	WebElement viewFare;
	@FindBy(xpath="//div[@class='v-aligm-m i-b' and (text()='5,651')]")
	WebElement Book;
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void booking() {
		viewFare.click();
		Book.click();
	}
	

}
