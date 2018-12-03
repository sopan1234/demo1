package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AdminPage;

public class Admintest extends TestBase {
	
	AdminPage admin;
	
	public Admintest() {
		
		super();
	}
	
	@BeforeMethod
	public void BeforeSetup() {
		
		initilization();
		
		admin=new AdminPage();
		
		
	}
	
	@Test(priority=0)
	public void loginIsdisplayedTest() {
		
		boolean actual=admin.Logodisplayed();
		
		Assert.assertTrue(actual);
	}
	
	@Test(priority=1)
	public void loginTest() {
		
		admin.logintest(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tail() {
		
		driver.close();
	}

}
