import java.util.Scanner;

/*
 * Have the user input their favorite color, food, animal and a first name
 * store inputs
 * print sentence 
 */

public class A3skhanFunnyFoods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your favorite color:");
		String color = keyboard.nextLine();
		System.out.println("Enter your favorite food:");
		String food = keyboard.nextLine();
		System.out.println("Enter your favorite animal:");
		String animal = keyboard.nextLine();
		System.out.println("Enter the first name of a friend or relative:");
		String name = keyboard.nextLine();
		System.out.println("I had a dream that "+ name+" ate a "+
		color +" "+animal+" and said it tasted like "+ food+"!" );

		


		


		
		


	}

}
