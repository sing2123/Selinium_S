package com.TestNGfeatures;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Simple_Annotations {
	
	
	@BeforeSuite
	public void propertySetting() {
		System.out.println("property Setting");		
	}
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Browser Launch");	
	}
	@BeforeMethod
	public void signin() {
		System.out.println("Url Launch");	
	}
	@Test
	public void women() {
		System.out.println("Women");		
	}
	@Test
	public void men() {
		System.out.println("Men");
	}
	@Test
	public void kids() {
		System.out.println("kids");
	}
	@Test
	public void signout() {
		System.out.println("Signout");
	}
}
