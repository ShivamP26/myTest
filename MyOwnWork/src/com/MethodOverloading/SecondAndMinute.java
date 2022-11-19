package com.MethodOverloading;

public class SecondAndMinute {
	
	public static void main(String[] args) {
		
		System.out.println(getDurationString(65L, 45L));
		System.out.println(getDurationString(3945L));
		
		
	}
	
	public static String getDurationString(long minute, long second) {
		
		if((minute < 0) || ((second < 0) || (second > 59))) {
			return "Invalid Value";
		}
		
		long newVal = (minute / 60);
		long remainingMinutes = minute % 60;
		
		String hoursString = newVal+ "h";
		if (newVal < 10 ) {
			hoursString = "0" + hoursString;	
		}
		
		String minutesString= remainingMinutes + "m";
		if (newVal < 10 ) {
		minutesString  = "0" + minutesString;
		}
		
		String secondString = second + "s";
		if(second < 10) {
			secondString = "0" + secondString; 
		}
		
        return (newVal + " hours " + remainingMinutes + " m " + second + " s ");
		
	}
	
	public static String getDurationString(long second) {
		if (second < 0) {
			return "Invalid Value";
		}
		
		long hours = second / 60;
		long newOne = second % 60;
	    return getDurationString(hours, newOne);	
	}

}
