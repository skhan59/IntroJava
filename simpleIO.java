import java.util.Scanner;
/*
 * Create Scanner Object
 * Read input from user
 * Print input to screen 
 */

public class simpleIO {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name:");
		String input; 
		input = keyboard.next();
		System.out.print("Hello  " +input);
		
	}

}
