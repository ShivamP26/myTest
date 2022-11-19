package com.ForStatement;

public class Main {
	public static void main(String[] args) {	
		for(int i=2; i<9; i++) {
			System.out.println("10,000 at " + i + "% intrest = "+ String.format("%.2f",calculateIntrest(10000.0, i)));
		}
		
		System.out.println("-----------------------------------");
		// How should you modify the for loop above to do the same thing as
		// Shown but to start from 8% and work back to 2%
		
		for(int i=8; i>1; i--) {
			System.out.println("10,000 at " + i + "% intrest = "+ String.format("%.2f",calculateIntrest(10000.0, i)));
		}

	}
	
	public static double calculateIntrest(double amount, double intresetRate) {
		return(amount *(intresetRate/100));
	}
}
