package com.crm.qa.pages;


import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class AddUsersPage extends TestBase {

	@FindBy(xpath = "//section[@class='content-header']")
	WebElement Adduserrtitle;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "mobile")
	WebElement mobile;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "Male")
	WebElement Male;

	@FindBy(id = "Female")
	WebElement Female;

	@FindBy(xpath = "html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")
	WebElement state;

	public AddUsersPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "submit")
	WebElement submit;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userplaceholder;

	@FindBy(xpath = "//input[@placeholder='Mobile']")
	WebElement Mobileplaceholder;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Emailplaceholder;

	@FindBy(xpath = "//select[@class='form-control']")

	WebElement statePlaceholder;

	@FindBy(xpath = "//input[@placeholder='Password']")

	WebElement PasswordPlaceholder;
	
	
	public ArrayList<String> PlaceHolderData() {
		
		 ArrayList<String> al=new ArrayList<String>();
		
		al.add(userplaceholder.getAttribute("placeholder"));
		
		al.add(Mobileplaceholder.getAttribute("placeholder"));
		
		al.add(Emailplaceholder.getAttribute("placeholder"));
		
		al.add(statePlaceholder.getText());
		
		al.add(PasswordPlaceholder.getAttribute("placeholder"));
		
		return al;
	}
	
	

	public boolean Addusertitle() {

		return Adduserrtitle.isDisplayed();
	}

	public String getUrlpage() {

		return driver.getCurrentUrl();
	}

	public String getDatauser(String uname, String mo, String emails,String gende,String states, String pass) {

		username.sendKeys(uname);

		mobile.sendKeys(mo);

		email.sendKeys(emails);

		if(gende.equalsIgnoreCase("Male"))
		{
			Male.click();
		}
		
		else if(gende.equalsIgnoreCase("Female"))
		{
			Female.click();
		}

		Select s = new Select(state);

		s.selectByVisibleText(states);

		password.sendKeys(pass);

		submit.click();

		return driver.switchTo().alert().getText();

	}

	public String currenturl() {

		return driver.getCurrentUrl();

	}

	public void checkdata() {

	}

}
