package org.mymavenproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleListener {
	
	@Test()
	public void sampleTest()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test()
	public void sampleTest2()
	{
		Assert.assertEquals(true, false);
	}
}
