package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();// compulsorly to call TestBase constructor for prop variables
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
	}

	@Test(priority = 2)
	public void logoImageTest() {
		boolean flag = loginPage.validateImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginTest() {
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
