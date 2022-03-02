package com.pomclass;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.properties.BaseClass1;

	public class Login_Page extends BaseClass1 {
	public WebDriver driver; 
		
		@FindBy(xpath = "(//a[@role='button'])[2]")
		private WebElement clickSingle;
		
		public Login_Page(WebDriver driver2) {
			
			this.driver = driver2;
			PageFactory.initElements(driver, this);
			
		}
	public void Login_Page111(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		}
	 public void Login_Page11(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	void Login_Page1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public WebElement getclickSingle() {
		return clickSingle;
	}

		
		
	}







