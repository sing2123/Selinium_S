package com.TestNGfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {

	@Test
	public void demo_Username() {
		
		String expected_Username = "Ranjani";
		String actual_Username  = "Ranjani";
		
		Assert.assertEquals(actual_Username, expected_Username);
		System.out.println("Validation");
	}
}
