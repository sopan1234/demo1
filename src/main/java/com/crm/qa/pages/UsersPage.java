package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class UsersPage extends TestBase {
	
	@FindBy(xpath="html/body/div[1]/div[1]/section[1]/h1")
	WebElement userstitle;
	
	@FindBy(xpath="html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")
	WebElement addusers;
	
	

	public UsersPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean	 userstitlePage() {
		
		return userstitle.isDisplayed();
	}
	

	
	public AddUsersPage AddPage() {
		
		addusers.click();
		
		return new AddUsersPage(); 
	}

}
