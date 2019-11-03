package com.test;

class Account {
	//private int acc_no;
	private int acc_bal;
	
	public void showData()
	{
		System.out.println("Displaying Data");
		
	}
	
	public void deposit (int a)
	{
		if (a<0) {
			System.out.println("ERROR");
		} else
			acc_bal=acc_bal+a;
	}
}
