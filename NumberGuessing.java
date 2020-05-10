import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		/**Number Guess Game
		 * Program picks a secret number and user tries to guess it.
		 * 
		 * @version 1.0 (Starter)
		 * 
		 * High Level Pseudocode
		 * 1. Get two integers from user to be a minimum and maximum within which secret will be picked
		 * 2. Generate the secret number
		 * 3. Loop asking user to enter a guess for the secret
		 *		if guess not match secret, give comment and continue loop
		 * 4. If guess matches the secret exactly, tell user and end program
		 */

		
		Scanner keyboard;
		int minNum;
		int maxNum;
		int secret;
		int guess;
		int totalGuesses;
		
		keyboard = new Scanner(System.in);
		totalGuesses = 1;
		
		System.out.println("Welcome to my Number Guesser! \n Enter two integers, a lower bound and an upper bound separated by a blank space. \n");;
		minNum = keyboard.nextInt();
		maxNum = keyboard.nextInt();

		secret = generateSecret(minNum, maxNum);
		
		System.out.println("Enter your guess for the secret: ");
		guess = keyboard.nextInt();
		while (secret != guess) {
			System.out.println(generateComment(guess, secret));
			totalGuesses = numberOfGuesses(totalGuesses);
			System.out.println("Enter your guess for the secret: ");
			guess = keyboard.nextInt();	
		}
		
		System.out.println("You Got It in " + totalGuesses + " tries!");
		
		keyboard.close();
	}

	//increment number of guesses made so far
	private static int numberOfGuesses(int guess) {
		// TODO Auto-generated method stub
		return 1;
	
	 	
	}

	private static String generateComment(int g, int s) {
		// TODO Auto-generated method stub
		if (g < s) 
		return "Wrong, Wrong, Wrong; go higher!";
		else if (g > s) 
			return "Wrong, Wrong, Wrong; go lower!";
		return ""; 
		
	}

	private static int generateSecret(int minNum, int maxNum) {
		// TODO Auto-generated method stub
		Random secret = new Random(); 
		return secret.nextInt(((maxNum - minNum) + 1) + minNum);
	}

	
}