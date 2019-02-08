package com.devopsadda.thirtydaysofcode;
import java.util.*;
public class Day01DataType {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        int intValue = Integer.parseInt(scan.nextLine());
        double doubleValue = Double.parseDouble(scan.nextLine());
        String stringValue = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        /* Print the sum of the double variables on a new line. */
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		
        System.out.println(i + intValue);
        System.out.println(d + doubleValue);
        System.out.println(s + stringValue);
        scan.close();
}
}