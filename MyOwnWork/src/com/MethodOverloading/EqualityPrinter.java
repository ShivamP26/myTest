package com.MethodOverloading;

public class EqualityPrinter {
	public static void main(String[] args) {
		printEqual(1,1,-1);
	}
	public static void printEqual(int x, int y, int z) {
		if((x < 0) ||  (y < 0) ||  (x < 0)) {
			System.out.println("Invalid value");
		}else if ((x == y) && (y == z)) {
			System.out.println("All numbers are equal");
		}else if((x!=y) && (y!=z) && (x!=z)){
			System.out.println("All numbers are different");
		}else {
			System.out.println("Neither all are equal or different");
		}	
	}

}
