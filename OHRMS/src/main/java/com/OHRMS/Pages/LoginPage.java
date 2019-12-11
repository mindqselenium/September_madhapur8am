package com.OHRMS.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRMS.baseclass.Baseclass;

import bsh.This;

//import Academy.HomePage;

public class LoginPage extends Baseclass {

	

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	//object repository or page factory
	@FindBy(name="txtUsername")
	WebElement username_textbox;
	
	@FindBy(name="txtPassword")
	WebElement password_textbox;
	
	@FindBy(xpath=".//*[@id='btnLogin'][@value='LOGIN']")
	WebElement LoginButton;
	
	public String validateloginPageTitle(){
		return driver.getTitle();
		
	}
	
	public HomePage  login(String un,String pwd) throws Exception{
		
		username_textbox.sendKeys(un);
		password_textbox.sendKeys(pwd);
		LoginButton.click();
		    LoginButton.click();
	return new HomePage();// navigating to home page once login was success or landing page
	    	   
	}
}
