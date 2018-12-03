package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class Addusers extends TestBase {
	
	@Test
	
	public void data() {
		
		System.setProperty("webdriver.chrome.driver","D:\\java by kiran\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("www.facebook.com");
	}
	
	

}
