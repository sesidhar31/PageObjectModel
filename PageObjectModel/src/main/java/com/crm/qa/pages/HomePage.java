package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.Base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Demo User ')]")
	WebElement UserLabel;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealsLink;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement ContactsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement TasksLink;

	// initiation of elements
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions or functions
	public String VerifyHomePageTitle() {

		return driver.getTitle();
	}

	public ContactsPage ClickOnContactsLink() {
		ContactsLink.click();
		return new ContactsPage();

	}
	
	public boolean VerifyuserLabel() {
		return UserLabel.isDisplayed();
		
	} 

	public DealsPage ClickOnDealsLink() {
		ContactsLink.click();
		return new DealsPage();
	}
	
	public TasksPage ClickOnTasksLink() {
		ContactsLink.click();
		return new TasksPage();
	}

}
