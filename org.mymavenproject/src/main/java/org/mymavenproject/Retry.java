package org.mymavenproject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 4; i ++) {
			System.out.println("The test case has been tried"+i+"times and test method is"+result.getName());
		}
		return false;
	}

}
