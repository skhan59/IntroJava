import java.util.Scanner;
/*
 * Ask player one for their choice of R, P, or S
 * Ask player two for their choice of R, P, or S
 * print out who won and why
 */
public class A4skhanRockPaperScissors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String playerOne;
		String playerTwo;
		System.out.println("Player one, choose R, P, or S : ");
		playerOne = keyboard.nextLine();
		System.out.println("Player two, choose R, P, or S : ");
		playerTwo = keyboard.nextLine();
		if (playerOne.equalsIgnoreCase("r")) {
			if (playerTwo.equalsIgnoreCase("p")) 
				System.out.println("Player two wins, paper covers rock");
		if (playerOne.equalsIgnoreCase("r")) 
				if (playerTwo.equalsIgnoreCase("s")) 
					System.out.println("Player one wins, rock breaks scissors");
		if (playerOne.equalsIgnoreCase("r")) 
			if (playerTwo.equalsIgnoreCase("r")) 
				System.out.println("Nobody Wins");
		}
		if (playerOne.equalsIgnoreCase("p")) {
			if (playerTwo.equalsIgnoreCase("r")) 
				System.out.println("Player one wins, paper covers rock");
		if (playerOne.equalsIgnoreCase("p")) 
			if (playerTwo.equalsIgnoreCase("p")) 
				System.out.println("Nobody Wins");
		if (playerOne.equalsIgnoreCase("p")) 
			if (playerTwo.equalsIgnoreCase("s")) 
				System.out.println("Player Two wins, scissors cut paper"); }
		
		if (playerOne.equalsIgnoreCase("s")) {
			if (playerTwo.equalsIgnoreCase("r")) 
				System.out.println("Player two wins, rock breaks scissors");
		if (playerOne.equalsIgnoreCase("s")) 
			if (playerTwo.equalsIgnoreCase("p")) 
				System.out.println("Player one wins, scissors cut paper");
		if (playerOne.equalsIgnoreCase("s")) 
			if (playerTwo.equalsIgnoreCase("s")) 
				System.out.println("Nobody Wins"); }	
		
		}
	}


