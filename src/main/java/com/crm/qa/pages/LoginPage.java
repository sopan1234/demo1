package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='login_box']/form/div/input[2]")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='login_box']/form/div/input[3]")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='login_box']/form/div/input[4]")
	WebElement submit;
	
	
	public void title() {
		
		driver.getTitle();
		
	}
	public void getdata(String uname,String pass) {
		
		username.sendKeys(uname);
		
		password.sendKeys(pass);
		
		submit.click();
		
	}
	
   
}
