package com.properties;

import org.openqa.selenium.WebDriver;

import com.pomclass.Page_Object_Manager;

public class Test_Runner extends BaseClass1{
	
	public static WebDriver driver = browserLaunch("chrome");
	 public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	 public static void main(String[] args) throws InterruptedException {
		 
		
		 launchUrl("https://www.facebook.com/");
		 
		 clickSingle(pom.getInstanceAc().getclickSingle());
		 Thread.sleep(2000);
		 passInput(pom.getInstanceAc().getFirstName(), "Shiva");
		 passInput(pom.getInstanceAc().getSurName(),"Ranjani");
		 passInput(pom.getInstanceAc().getMobNo(),"94149960942");
		 
		
	}
		
	}


