package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AdminPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.TestUtils;

public class HomePageTest extends TestBase {
	
	AdminPage admin;
	
	HomePage home;
	
	TestUtils test;

	public HomePageTest() {
		
	}
	
	@BeforeMethod
	
	public void BrowserLogin() {
	
        initilization();
		
		admin=new AdminPage();
		
		home=new HomePage(); 
		
		test=new TestUtils();
		
		admin.logintest(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void TitleTest() {
	
		String actual=home.Title();
		
		String expected="AdminLTE 2 | Dashboard";
		
		Assert.assertEquals(actual, expected,"Titli is not get");
	}
	
	@Test(priority=2)
	public void DashboardTest() {
		boolean actual=home.Dashboard();
		Assert.assertTrue(actual);
		
	}
	
	@Test(priority=3)
	public void UsersTest() {
		
		home.Users();
		
			}
	
	@Test(priority=4)
	public void logoutTest() {
		
		boolean actual=home.logout();
		Assert.assertTrue(actual); 
	}
	

	
	@AfterMethod
	public void tail() {
		
		driver.quit();
		
	}
	
}
