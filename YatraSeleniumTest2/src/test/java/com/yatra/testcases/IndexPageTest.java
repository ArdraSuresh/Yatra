/**
 * 
 */
package com.yatra.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.yatra.base.BaseClass;
import com.yatra.pageObjects.IndexPage;

/**
 * @author ardra
 *
 */
public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	@BeforeMethod
	public void setup() {
		launchApp();
	}
    @AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
    public void verifyLogo() throws Throwable {
    	indexPage= new IndexPage();
    	boolean result=indexPage.validateLogo();
    	Assert.assertTrue(result);
	
	}
	@Test
	public void verifyTitle() {
		String actTitle=indexPage.yatraTitle();
		Assert.assertEquals(actTitle, "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com");
		}
	@Test
	public void searchBtnTest() throws Throwable {
		indexPage= new IndexPage();
		indexPage.clickOnSearch();
		//boolean result=indexPage.SearchPage();
		//Assert.assertTrue(result);
		}
	
}

