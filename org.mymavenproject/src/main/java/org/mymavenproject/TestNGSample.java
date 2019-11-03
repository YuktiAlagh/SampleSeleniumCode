package org.mymavenproject;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNGSample {

	@Test(priority=3,groups= {"Regression"})
	public void sample() {
		System.out.println("This is sample test");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("This is after method");
	}
	
	@Test(enabled=false)
	public void sample1() {
		System.out.println("This is sample test 1");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is after class");
	}
	@Test(priority=1,groups= {"Sanity"})
	public void sample2() {
		System.out.println("This is sample test 2");
		Assert.assertEquals(true, false);
	}
	
	@Test(priority=2,groups= {"Smoke"})
	public void sample3() {
		System.out.println("This is sample test 3");
	}
}
