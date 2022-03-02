package com.pomclass;

import org.openqa.selenium.WebDriver;

import com.pomclass.Account_Creation;
import com.pomclass.Login_Page;

public class Page_Object_Manager {
	public WebDriver driver;
	private Login_Page lp;
	private Account_Creation ac;
	public Page_Object_Manager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public Login_Page getInstanceLp() {
		if(lp==null) {
			lp = new Login_Page(driver);
			
		}
		return lp;		
	}
public Account_Creation getInstanceAc() {
	if(ac==null) {
		ac=new Account_Creation(driver);
		
	}
	return ac;
}
}
