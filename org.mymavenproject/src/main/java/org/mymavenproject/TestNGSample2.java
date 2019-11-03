package org.mymavenproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample2 {

	@Test(groups= {"Regression"})
	public void sam1() {
		System.out.println("Hi");
	}
	
	@Test(groups= {"Sanity"})
	public void sam2() {
		System.out.println("Hello");
	}
	
	@BeforeMethod
	public void before1() {
		System.out.println("Welcome");
	}
	
	@AfterMethod
	public void after1() {
		System.out.println("Bye");
	}
}
