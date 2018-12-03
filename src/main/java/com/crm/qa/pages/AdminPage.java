package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AdminPage extends TestBase{
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement login;

	@FindBy(xpath="html/body/div[1]/div[1]/a")
	WebElement logo;
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
 	}
	
	
	public HomePage logintest(String users,String passw) {
		
		
		email.sendKeys(users);
		
		pass.sendKeys(passw);
		
		login.click();
		
		return new HomePage();
	}
	
	


	public boolean Logodisplayed() {
		
		 return logo.isDisplayed();
	}
	


}
