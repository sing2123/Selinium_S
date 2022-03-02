package com.TestNGfeatures;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	public void chicken() {
		System.out.println("Chicken");	
	}
	@Test(enabled = false)
	public void muttonBiriyani() {
		System.out.println("Mutton Briyani");	
	}
	@Test

	public void chickenRollShawarma() {
		System.out.println("Chicken Roll Shawarma");
		
	}
	@Test
	public void sambar() {
		System.out.println("Sambar Rice");
		
	}
	@Ignore
	@Test
	public void curdRice() {
		System.out.println("Curd Rice");
		
	}
	
}
