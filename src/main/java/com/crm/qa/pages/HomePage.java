 package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="html/body/div[1]/div[1]/section[1]/h1")
	WebElement title;
	
	@FindBy(xpath="html/body/div[1]/aside[1]/section/ul/li[2]/a")
	WebElement dashboard;
	
	@FindBy(xpath="//a[@href='users.html']")
	WebElement users;
	
	@FindBy(xpath="//a[@href='operators.html']")
	WebElement operators;
	
	@FindBy(xpath="html/body/div[1]/aside[1]/section/ul/li[5]/a/span")
	WebElement logout;
	
	
	
	@FindBy(xpath="html/body/div[1]/header/nav/div/ul/li/a")
	WebElement LOGOUT;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String Title() {
		
		 return driver.getTitle();
	}
	
	
	public UsersPage usersspage() {
		
		users.click();
		
		return new UsersPage();
				}
	
	public boolean Dashboard() {
		 return dashboard.isDisplayed();
	}
	
	
	public UsersPage Users() {
		  users.click();
		  return new UsersPage();
	}
	public boolean logout() {
		 return logout.isDisplayed();
	}
	
	
	
	
	

}
