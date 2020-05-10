import java.util.Scanner;
/*
 * Create Scanner Object
 * Ask for a temperature in degrees Fahrenheit from the user
 * create a variable called Celsius that converts the user input into Degrees Celsius
 * Print Degrees in Celsius to screen 
 */


public class A2skhanArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a temperature in Degrees Fahrenheit:");
		double fahrenheit = keyboard.nextDouble();
		double celsius = 5*(fahrenheit-32)/9;
		System.out.println(fahrenheit+" Degrees Fahrenheit, is ");
		System.out.printf("%.1f", celsius);
		System.out.print(" in Degrees Celsius");



		
		
		
	}

}
