package com.MethodOverloading;

public class DaysCalculator {
	public static void main(String[] args) {
	printYearsAndDays(561600);
	}
	
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		}else {
			long newMinutes = (minutes) / 60;
			long day = (newMinutes / 24);
			long years = day/365;
			long newMinutes1 = day % 365;
			System.out.println(minutes + " min = " + years + " y and " + newMinutes1 + " d");
		}
	}

}
