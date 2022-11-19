package com.MethodOverloading;

public class Test {
	public static void main(String[] args) {
		
		int newScore = calculateScore("James", 100);
		System.out.println("New Score is: " + newScore);
		calculateScore(100);
		calculateScore();
		
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " Scored " + score + " points" );
		return score * 1000; 
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnanmed player Scored " + score + " points" );
		return score * 1000; 
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score" );
		return 0; 
	}
	
}
