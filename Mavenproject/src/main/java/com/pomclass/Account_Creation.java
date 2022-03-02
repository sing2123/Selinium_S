package com.pomclass;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.properties.BaseClass1;

	public class Account_Creation extends BaseClass1 {
		public WebDriver driver;
		
		@FindBy(name = "firstname")
		private WebElement firstname;
			
		@FindBy(name="lastname")
		private WebElement surName;
		
		@FindBy(xpath ="(//input[@type='text'])[4]")
		private WebElement mobNo;
		
		public Account_Creation(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
			
		}
		public void Account_Creation1(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		}
		public WebElement getFirstName() {
			return firstname;
			
		}
		
		public WebElement getSurName() {
			return surName;
			
		}
		
		public WebElement getMobNo() {
			return mobNo;
			
		}
		public WebElement getclickSingle() {
			// TODO Auto-generated method stub
			return null;
		}
			
		}
		
		
		
			
		








