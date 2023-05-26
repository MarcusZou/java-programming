package giraffe;
import java.util.Scanner;

public class App20_GuessingGame {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		String secretWord = "giraffe";
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		while(!guess.equals(secretWord) && !outOfGuesses) {
			
			if(guessCount < guessLimit) {
				System.out.println("Enter a guess: ");
				guess = keyboardInput.nextLine();
				guessCount++;
			} else {
				outOfGuesses = true;
			}
		}
		if(outOfGuesses) {
			System.out.println("You Lose! No more guesses.");
		} else {
			System.out.println("You Win!");
		}
		
		keyboardInput.close();

	}

}
