package com.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPageObject extends BasePage {

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement login;

	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void logintoApp() {
		userName.sendKeys("Abuthaheer");
		passWord.sendKeys("test123");
		login.click();
		
	}

	
}
