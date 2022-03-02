package com.TestNGfeatures;

import org.testng.annotations.DataProvider;

public class Dataprovider_Concept {
	
	public void credentials(String username , String password) {
		System.out.println("username is :"+username);
		System.out.println("password is :"+password);
		
	}
	
	
	@DataProvider
	public Object[][] inputData() {
		return new Object[][] {
			{"sivaranjani" , "123"},
			{"Eswari" ,"153"},
			{"karthi" ,"143"}
		};
		
	}
}
	
	


	

