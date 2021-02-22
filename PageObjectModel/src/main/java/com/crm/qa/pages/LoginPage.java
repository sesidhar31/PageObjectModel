package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	//1.we need to define object repository(Page factory)
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement SignUplink;
	
	@FindBy(className = "img-responsive")
	WebElement logoimg;
	
	//we have initialize all these elements using page factory
	//create the constructor
	
	public LoginPage() {		
		PageFactory.initElements(driver, this);		
	}

	//Actions/Methods
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateImage() {
		return logoimg.isDisplayed();
	}
	
	
	public HomePage Login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage(); //after login page, landing on to home page so it should return homepage object
		
	}
	
	
	
	
}
