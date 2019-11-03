package org.mymavenproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClass2 {
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Before
	public void testbefore2() {
		System.out.println("TestBefore2");
	}
	
	@After
	public void testafter2() {
		System.out.println("TestAfter2");
	}
}
