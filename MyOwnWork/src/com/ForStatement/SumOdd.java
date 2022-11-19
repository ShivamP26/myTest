package com.ForStatement;

public class SumOdd {
	public static void main(String[] args) {
		System.out.println(isOdd(24));
		System.out.println(sumOdd(9,1000));
	}
	
	public static boolean isOdd(int number) {
		if(number<= 0) {
			return false;
		}else return (number % 2 != 0);
	}
	public static int sumOdd(int start, int end) {
		if((end < start) || (end < 0) || (start < 0)) {
			return -1;
		}
		int sum = 0;
		
		for(int i = start; i<=end; i++) {
			if(isOdd(i)) {
				sum+=i;
			}
		}
		return sum;
	}
	
}
