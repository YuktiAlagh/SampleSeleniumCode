package org.mymavenproject;

import org.testng.annotations.Test;

public class TestScript {
	@Test(dataProvider="data" ,dataProviderClass=DataSet.class)
	public void data(String n, String m) {
		int a=Integer.parseInt(n);
		int b=Integer.parseInt(m);
		int sum=a+b;
		int diff=a-b;
		int div=a/b;
		int mul=a*b;
		
		System.out.println("The sum is"+sum);
		System.out.println("The diff is"+diff);
		System.out.println("The div is"+div);
		System.out.println("The mul is"+mul);
	}
	
}
