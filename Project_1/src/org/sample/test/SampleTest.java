package org.sample.test;

public class SampleTest {
	/*public static void main(String args[])
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);	
	}
*/
	public static void main(String args[])
	{
		SampleTest sam=new SampleTest();
		sam.fibonacciDisplay();
		//fibonacciDisplay();
	}
	public  void fibonacciDisplay()
	{
		int a=0, b=1;
		System.out.print(a+" ");
		for(int i=0; i<5; i++)
		{
			b=a+b;
			System.out.print(b+" ");
			a=b-a;
		}
		/*int x=0, y=1, sum=0;
		for(int i=0; i<10; i++)
		{
			sum=sum+y;
			}
		System.out.println(sum);
	*/	
	}
}
