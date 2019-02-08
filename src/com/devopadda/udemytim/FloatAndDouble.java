package com.devopadda.udemytim;

public class FloatAndDouble {

	public static void main(String[] args) {
		int myIntValue = 5/2;
		float myFloatValue = 5f / 2f;
		double myDoubleValue = 5d / 3d;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);
		
		// Note: 1 pound is equal to 0.45359237 kilograms.
		
		double numPounds = 200d;
		double convertToKilograms = numPounds * 0.45359237d;
		System.out.println("Kilograms = " + convertToKilograms);
	}

}
