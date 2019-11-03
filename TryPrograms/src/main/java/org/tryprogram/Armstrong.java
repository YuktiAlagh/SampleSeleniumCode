package org.tryprogram;

public class Armstrong {

	public static void main(String[] args) {
		boolean p=armCode(135);
		System.out.println(p);
	}
		// TODO Auto-generated method stub
	public static boolean armCode(int n) {
		int arm=0,temp=n,r=0;
		while(n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
			
		}		
		
		if(arm==temp)
			{
			System.out.println("No. is armstrong");
		    return true;
	       }
		else
		{
			System.out.println("No. is not armstrong");
			return false;
		}
				
	}

	}


