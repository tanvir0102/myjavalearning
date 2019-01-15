package com.devopsadda.basicjava;

import java.util.Scanner;

public class DataTypeUserInput {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value of a:");
		a = scan.nextInt();
		System.out.println("Please enter value of b:");
		b = scan.nextInt();
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		scan.close();

	}

}
