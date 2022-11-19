package com.Method;

public class ChallangeOne {
	
	public static void displayHighScorePosition(String name, int score) {
		System.out.println(name + " managed to get into position " + score + " on the high score table"); 
	}
	
	public static int calculateHighScorePosition(int playerScore)
	{
		if ((playerScore >= 1000)) {
			return 1;
		}else if (playerScore >= 500) {
			return 2;
		}else if (playerScore >= 100) {
			return 3;
		}
		return 4;
	}
	
	public static void main(String[] args) {
		
		int newScore = calculateHighScorePosition(1000);
		displayHighScorePosition("Jose", newScore);
		
		newScore = calculateHighScorePosition(500);
		displayHighScorePosition("Jamse", newScore);
		
		newScore = calculateHighScorePosition(100);
		displayHighScorePosition("Jamie", newScore);
		
		newScore = calculateHighScorePosition(50);
		displayHighScorePosition("Janki", newScore);
	
	}
}
