/**
 * 
 */
package com.yatra.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.yatra.actiondriver.Action;
import com.yatra.base.BaseClass;

/**
 * @author ardra
 *
 */
public class IndexPage extends BaseClass {
	Action action= new Action();
	
	@FindBy(xpath="//div[@class=\"header-left-menu ftL\"]")
	WebElement yatraLogo;
	
	@FindBy(xpath="//input[contains(@value,\"Search Flights\")]")
	WebElement searchBtn;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean validateLogo() throws Throwable{
		return action.isDisplayed(driver,yatraLogo);
	}
	
	public String yatraTitle() {
		String yatraTitle1=driver.getTitle();
		return yatraTitle1;
	}
	
	public void clickOnSearch() throws Throwable {
		action.click(driver, searchBtn);
	}
	/*public SearchResultPage SearchPage() {
		// TODO Auto-generated method stub
		action.click(driver, searchBtn);
		return new SearchResultPage();
	}*/

}
