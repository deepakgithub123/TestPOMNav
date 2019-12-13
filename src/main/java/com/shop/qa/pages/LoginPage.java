package com.shop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.shop.qa.base.TestBase;

public class LoginPage extends TestBase{

//Page Factory-OR 
//	@FindBy(xpath=)
	
	@FindBy(name="userBean.email")
	WebElement username;	
	
	@FindBy(name="userBean.password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement lgnButton;
		
	//Define all the above object repositories/ how to initialize the element using page factory
	
	//Initializing the page objects
	public LoginPage() {
	PageFactory.initElements(driver, this);	
	}
	
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgnButton.click();
	
		return new HomePage();
	}
}
