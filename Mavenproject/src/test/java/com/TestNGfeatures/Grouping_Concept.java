package com.TestNGfeatures;

import org.testng.annotations.Test;

public class Grouping_Concept {
	@Test(groups = "Non veg")
	public void chicken() {
		System.out.println("Chicken");	
	}
	@Test(groups = "Non Veg")
	public void muttonBiriyani() {
		System.out.println("Mutton Briyani");	
	}
	@Test(groups = "Non Veg")
	public void chickenRollShawarma() {
		System.out.println("Chicken Roll Shawarma");	
	}
	@Test(groups = "Veg")
	public void sambar() {
		System.out.println("Sambar Rice");		
	}	
	@Test(groups = "veg")
	public void curdRice() {
		System.out.println("Curd Rice");
	}
}
