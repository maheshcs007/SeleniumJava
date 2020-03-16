package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement usernameTB;
	
	@FindBy(name="password")
	WebElement passwordTB;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	public void setUsername(String username)
	{
		usernameTB.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		passwordTB.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
}
