package com.TestNGfeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {

	@Test
	@Parameters({"username" , "password"})
	public void credentials(String username , String password) {
		
		System.out.println("username is :"+username);
		System.out.println("password is :"+password);
	}
	
}
