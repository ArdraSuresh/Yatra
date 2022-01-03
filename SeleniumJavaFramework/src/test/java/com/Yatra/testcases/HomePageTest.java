package com.Yatra.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Yatra.base.BaseClass;
import com.Yatra.pages.BookingPage;
import com.Yatra.pages.HomePage;

public class HomePageTest extends BaseClass {
	HomePage homePage;
	BookingPage bookingPage;
@Test
public void VerifyUrl() {
	bookingPage=homePage.search();
	String expectedURL ="https://www.yatra.com/";
	String actualURL = driver.getCurrentUrl();
	Assert.assertEquals(actualURL, expectedURL);
	}
}
