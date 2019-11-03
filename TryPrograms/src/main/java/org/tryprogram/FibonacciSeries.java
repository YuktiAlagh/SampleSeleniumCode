package org.tryprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		armCode();
	}
	
		public static void armCode(){
        int i=0, j=1;
        System.out.println(i+" "+j);
    	for(int k=1;k<=10;i++)
    	{   
    		int s=i+j;
    		System.out.print(s);
    		i=j;
    		j=j+1;
    	}
	}

}

