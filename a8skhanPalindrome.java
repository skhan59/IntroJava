/*
 *Have the user enter a string
 *convert the string into individual characters and store them into an array
 *get rid of any punctuation
 *have the string the user entered be printed backwards and see if it's equal to the original user input
 *if it is, declare it to be a palindrome 
 *ask the user if they want to enter another one in, and keep asking until they say no
 */
import java.util.Scanner;

public class a8skhanPalindrome {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String goAgain;
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a string to see if it is a true palindrome or not: ");
			String originalString = keyboard.nextLine();
			boolean palindrome = isPalindrome(originalString);
			System.out.println(palindrome);
			System.out.println("Do you want to go again? Enter Y for yes, or N for no: ");
			goAgain = keyboard.nextLine();
			
			
		} while(goAgain.equalsIgnoreCase("Y"));	}
	
	
	static int length; 
	private static boolean isPalindrome(String StringOne) {
		String noPunctuation = StringOne.replaceAll("\\p{Punct}","").replaceAll(" ", "").toLowerCase(); 
		char[] x = noPunctuation.toCharArray();
		for (int i= 0; i<=x.length/2;) {
			for (int k = x.length-1; k >= x.length/2;) 
				if (x[i] == x[k])
				{
				i++;
				k--;
			}
			else {
				return false;
			}
				
		}
		return true;
		
	}

}
