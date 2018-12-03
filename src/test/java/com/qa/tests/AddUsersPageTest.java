package com.qa.tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddUsersPage;
import com.crm.qa.pages.AdminPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.UsersPage;
import com.crm.qa.util.TestUtils;

public class AddUsersPageTest extends TestBase {

	public AddUsersPageTest() {
		super();
	}

	AdminPage admin;

	HomePage home;

	UsersPage users;

	TestUtils test;

	AddUsersPage addpage;
	
	
	
	 static ExtentReports extent;
	
	static ExtentTest logger;
	
	
	public static void setExtent() {
		
	
		
	}

	@BeforeMethod
	public void LoginBrowser() {

		initilization();
		admin = new AdminPage();

		home = new HomePage();

		test = new TestUtils();

		users = new UsersPage();

		admin.logintest(prop.getProperty("username"), prop.getProperty("password"));

		users = home.usersspage();

		addpage = new AddUsersPage();

		addpage = users.AddPage();
	}

	@Test(priority = 1)
	public void AddUsersPageTitleTest() {
  
		boolean actual = addpage.Addusertitle();

		Assert.assertTrue(actual);
	}
	
	
	@Test(priority = 4)
	public void	 placeholderTest() {
		
		ArrayList<String> actual=addpage.PlaceHolderData();
		
		ArrayList<String> exp=new ArrayList<String>();
		
		exp.add("Username");
		
		exp.add("Mobile");
		
		exp.add("Email");
		
		exp.add("[[--Select State--]]");
		
		exp.add("Password");
		
		assertEquals(actual, exp,"placeholder not matched");
	}
	
	@DataProvider
	public void loginData() {
		
	}

	@Test(priority = 2)
	public void getDataUsersTest(String username,String mobile,String email,String gender,String State,String passw ) {

		String actual=addpage.getDatauser(username, username, email,gender,State, passw);
		
		Assert.assertEquals(actual,"User Added Successfully. You can not see added user.","user not added succes");

	

	}
	
	@Test(priority = 3)
	public void currentUrlTest() {
		
		String actual=addpage.currenturl();
		
		assertEquals(actual, "file:///D:/sopan/Selenium%20Software/Offline%20Website/pages/examples/add_user.html");
		
	}
	
	

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
