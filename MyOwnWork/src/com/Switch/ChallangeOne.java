package com.Switch;

public class ChallangeOne {
	public static void main(String[] args) {
		
		char newValue = 'F';
		switch(newValue) {
		case 'A':case 'B':case 'C':case 'D':case 'E':
			System.out.println("The Char Value is A , B , C , D or E ");
			break;
			default:
				System.out.println("This is beyound E Character");
				break;
		}
		
		String month = "January";
		switch(month.toLowerCase()) {
		case "January":
			System.out.println("Jan");
			break;
		case "June":
			System.out.println("Jun");
			break;
			default:
				System.out.println("Not Sure");
		}
	}

}
