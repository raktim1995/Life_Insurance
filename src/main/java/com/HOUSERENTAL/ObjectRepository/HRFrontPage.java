package com.HOUSERENTAL.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRFrontPage {

	//Initialization
	public HRFrontPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Declaration
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerBtn;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement searchBtn;

	//Getter Method
	public WebElement getRegisterButton() {
		return registerBtn;
	}

	public WebElement getLoginButton() {
		return loginBtn;
	}

	public WebElement getSearchButton() {
		return searchBtn;
	}

	//Business Logic
	public void login()
	{
		loginBtn.click();
	}
	
	public void register()
	{
		registerBtn.click();
	}
	
	public void search()
	{
		searchBtn.click();
	}
	
	
	
	



}
