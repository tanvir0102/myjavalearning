package com.devopsadda.basicjava;

public class ArrayExample {

	public static void main(String[] args) {
		int [] myArray = new int[10];
		for(int i = 0; i < 10; i++)
		{
			myArray[i] = 100 + i;
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Value of array index " + i +" is " + myArray[i]);
		}

	}

}
