package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public  HomePageTest() {
		super();
	}	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyHomepageTitleTest() {
		String homePageTitle=homePage.VerifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home Page title missmatch");
		//Assertion message will prints only when assertion is failed
		
	}
	@Test(priority = 2)
	public void VerifyUserLabelTest() {
		testUtil.switchToFrame();
		boolean flag = homePage.VerifyuserLabel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void VerifyContactLinkTest() {
		testUtil.switchToFrame();
		contactsPage = homePage.ClickOnContactsLink();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
