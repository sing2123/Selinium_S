package com.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Creation {
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement userid;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "login")
	private WebElement log;
	
	public Account_Creation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getUserid() {
		return userid;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLog() {
		return log;
	}	


}
