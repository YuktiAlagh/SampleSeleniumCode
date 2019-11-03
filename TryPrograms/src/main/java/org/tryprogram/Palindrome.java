package org.tryprogram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder,sum=0,k;    
		  int num=121;//It is the number variable to be checked for palindrome  
		  
		  int s=num;    
		  while(num>0){    
		   remainder=num%10;  //getting remainder  
		   sum=(sum*10)+remainder;    
		   num=num/10;    
		  }    
		  if(s==sum)    
		   System.out.println("No. is palindrome");    
		  else    
		   System.out.println("No. is not palindrome");    
		}  
}
