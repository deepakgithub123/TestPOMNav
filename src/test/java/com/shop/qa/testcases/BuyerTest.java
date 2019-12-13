package com.shop.qa.testcases;

import com.shop.qa.base.TestBase;
import com.shop.qa.pages.HomePage;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shop.qa.pages.LoginPage;
import com.shop.qa.pages.Buyer;
//import TestMethods.ValidHomePage;
//import registrationTesting.Home_page;

//import com.shop.qa.pages.LoginPage;


public class BuyerTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public BuyerTest() throws IOException{
	super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialize();
		loginPage = new LoginPage();
	}


	@Test(priority=1)
	public void loginTest1() throws InterruptedException
	{
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		Buyer.lnk_Buyers(driver);
	}
	
	/*
	// Buyers page test case
	@Test(priority=2)
	public void buyresPage() throws InterruptedException {
		Buyer.lnk_Buyers(driver);

	}
*/
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
