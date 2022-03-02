package com.TestNGfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Demo {
	@Test
	public void login1() {
		String exp = "java";
		String act = "java";
		
		Assert.assertEquals(act, exp);
		
	}
	@Test(retryAnalyzer = Rerun.class)
	public void login2() {
		String exp = "selenium";
		String act = "Selenium";
		Assert.assertEquals(act, exp);
		
	}

}
