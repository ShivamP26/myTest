package com.Switch;

public class Test {
	public static void main(String[] args) {
//		int value = 1;
//		if(value == 1) {
//			System.out.println("Value was 1");
//		}else if (value == 2) {
//			System.out.println("Value was 2 ");
//		}else {
//			System.out.println("Was not 1 or 2");
//		}
		
		int switchValue = 2;
		switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
			
		case 2:
			System.out.println("Value was 2");
			break;
			
		case 3:case 4:case 5:
			System.out.println("was a 3, or 4, or 5");
			System.out.println("Actually it was a " + switchValue);
			default:
				System.out.println("Was not 1 or 2");
				break;
		}
		
		// More code here 
	}

}
