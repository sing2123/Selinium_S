package com.TestNGfeatures;

import org.testng.annotations.Test;

public class Dependency_Concept {

	@Test
	public void tenth() {
		System.out.println("Tenth");	
	}
	@Test(dependsOnMethods = "tenth")
	public void twelth() {
		System.out.println("Twelth");
	}
	
	
}
