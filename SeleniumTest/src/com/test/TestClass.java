package com.test;

public class TestClass {
	
	public static void main(String[] args)
	{
		System.out.println("Hi Java");
		Animal animal = new Animal();
		animal.setName("Max the Dog");
		String name = animal.getName();
		System.out.println(name);
	}
	 

}
