package templatemethod;

import java.util.Scanner;

public class GuessTheNumber extends Game {

	 	private int number;
	 	private int guess;
	 	private int[] guesses;

	 	@Override
	 	void initializeGame() {
	 		System.out.println("Goal of this game is to guess a number between 1 and 20.");
	 		number = (int) (Math.random() * 20) + 1;
	 		guesses = new int[playersCount];
	    }

	 	@Override
	 	void makePlay(int player) {
	 		System.out.println("Player " + (player + 1) + ", make a guess: ");
	 		Scanner scanner = new Scanner(System.in);
	 		guess = scanner.nextInt();
	 		while (guess < 1 || guess > 20) {
	 			System.out.println("Number needs to be between 1 and 20. Give another guess:");
	 			guess = scanner.nextInt();
	 		}
	 		guesses[player] = guess;
	 	}

	 	@Override
	 	boolean endOfGame() {
	 		for (int guess : guesses) {
	 			if (guess == number) {
	 				return true;
	 			}
	 		}
	 		return false;
	 	}

	 	@Override
	 	void printWinner() {
	 		for (int i = 0; i < playersCount; i++) {
	 			if (guesses[i] == number) {
	 				System.out.println("Player " + (i + 1) + " wins!");
	 			}
	 		}
	 	}
}

