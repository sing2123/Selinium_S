package com.TestNGfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
	@Test
	public void demo_Password() {
		
		String expected_Password = "karthi";
		String actual_password = "karthi";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual_password, expected_Password);
		System.out.println("Verification");
	}

}
