package org.tryprogram;

import java.io.IOException;

public class UserInsertNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = 1;
		System.out.println("Enter number to print table!!!");
		System.out.println("Below is table of "+n+":");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
