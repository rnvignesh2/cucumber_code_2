package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;



public class PomLoginPage extends BaseClass 

{
	
	public PomLoginPage() {
PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;
	


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}


	public WebElement getUser() {
		return user;
	}
	
}


