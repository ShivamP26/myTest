package com.MethodOverloading;

public class ChallangeOne {
	
	public static void main(String[] args) {
	double newVal = calcFeetAndInchesToCentimeters(5, 6);
	if(newVal < 0) {
		System.out.println("Invalid Parameter");
	}
		calcFeetAndInchesToCentimeters(157);
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println("Invalid Result");
			return -1;
		}
		
			double newPoint = (feet * 12.0);
			newPoint = newPoint + (inches * 2.54);
			System.out.println(feet + " foot " + inches + " inches = " + newPoint + " cm ");
			return newPoint;
		}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches < 0) {
			return -1;
		}
		double feet = ( int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to" + feet + " feet and " + remainingInches);
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
}

