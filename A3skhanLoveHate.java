/*
 * Ask the user to input a line of text
 * have the program find the first time the text uses the word "hate"
 * replace it with love
 * print the new line of text
 */
import java.util.Scanner;
public class A3skhanLoveHate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		{
		String input;
		input=keyboard.nextLine();
		input=input.replaceFirst("hate","love");
		System.out.println("I have rephrased that line to read:");
		System.out.println (input);
		}
		}
	}
