package org.mymavenproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClass3 {
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	
	@Before
	public void testbefore3() {
		System.out.println("TestBefore3");
	}
	
	@After
	public void testafter3() {
		System.out.println("TestAfter3");
	}
}
