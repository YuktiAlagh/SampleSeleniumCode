package org.mymavenproject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestClass1.class,
	TestClass2.class,
	TestClass3.class
})
public class TestSuite {

}
