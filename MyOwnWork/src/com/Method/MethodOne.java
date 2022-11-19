package com.Method;

public class MethodOne {
	
	public static int calculatedScore(boolean gameOver, int score, int levelCompled, int bonus) {
		
		if (gameOver) {
			int finalScore = score + (levelCompled * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1; 
}
	public static void main(String[] args) {
		
		int highScore = calculatedScore(true, 800, 8, 200);
		System.out.println("Your final score was " + highScore);
	}

}
