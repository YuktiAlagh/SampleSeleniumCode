package org.mymavenproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClass1 {

	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Before
	public void testbefore1() {
		System.out.println("TestBefore1");
	}
	
	@After
	public void testafter1() {
		System.out.println("TestAfter1");
	}
}
