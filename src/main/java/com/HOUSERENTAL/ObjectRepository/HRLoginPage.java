package com.HOUSERENTAL.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRLoginPage {

	//Initialization
		public HRLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Declaration
		@FindBy(id = "exampleInputEmail1")
		private WebElement emailTxtFldForLogin;
		
		@FindBy(id = "exampleInputPassword1")
		private WebElement pwdTxtfldForLogin;
		
		@FindBy(name = "login")
		private WebElement loginBtn;

		//Getters Method
		public WebElement getEmailTxtFldForLogin() {
			return emailTxtFldForLogin;
		}

		public WebElement getPwdTxtfldForLogin() {
			return pwdTxtfldForLogin;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		//Business Logic
		public void loginAsUser(String uname, String pwd)
		{
			emailTxtFldForLogin.sendKeys(uname);
			pwdTxtfldForLogin.sendKeys(pwd);
			loginBtn.click();
		}
		
		public void loginAsAdmin(String uname, String pwd)
		{
			emailTxtFldForLogin.sendKeys(uname);
			pwdTxtfldForLogin.sendKeys(pwd);
			loginBtn.click();
		}

	}


