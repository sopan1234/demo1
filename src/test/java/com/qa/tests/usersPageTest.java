package com.qa.tests;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AdminPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.UsersPage;
import com.crm.qa.util.TestUtils;

public class usersPageTest extends TestBase {

	AdminPage admin;
	
	HomePage home;
	
	UsersPage users;
	
	TestUtils test;
	
	public usersPageTest() {
		super();
	}
	
	@BeforeMethod
	public void LoginBrowser() {
	
		initilization();
        admin=new AdminPage();
		
		home=new HomePage(); 
		
		test=new TestUtils();
		
		users=new UsersPage();
		
		admin.logintest(prop.getProperty("username"), prop.getProperty("password"));
		
		users=home.usersspage();
	}
	
	@Test(priority=1)
	
	public void UsersAPgeTitletest() {
		
		boolean actual=users.userstitlePage();
		
	Assert.assertTrue(actual);
	} 
	
	@Test(priority=2)
	public void AddusersTest() {
		
		users.AddPage();
	}

	
	
	@AfterMethod
	public void tearDown() {
	
		driver.quit();
	}
	
	
}
