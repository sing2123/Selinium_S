package com.TestNGfeatures;

import org.testng.annotations.Test;

public class Expected_Exceptions_Conept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
		int a = 10;
		System.out.println(a/10);
		
	}

}
