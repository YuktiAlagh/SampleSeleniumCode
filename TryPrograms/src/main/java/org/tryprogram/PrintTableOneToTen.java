package org.tryprogram;

public class PrintTableOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++)
			
		{   
			System.out.println("Below is table of "+i+":");
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}   
	}

}