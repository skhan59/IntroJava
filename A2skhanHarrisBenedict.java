import java.util.Scanner;

/*
 * Create Scanner Object
 * Ask for weight and store it as a variable
 * Ask for height and store it as a variable
 * Ask for age and store it as a variable
 * create two variables for the male BMR and female BMR equation that uses the users inputs 
 * output both BMR's divided by 230 (Calories in a chocolate bars)
 
 */


public class A2skhanHarrisBenedict {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your weight in pounds:");
		double weight = keyboard.nextDouble();
		System.out.println("Enter your height in inches:");
		double height = keyboard.nextDouble();
		System.out.println("Enter your age in years:");
		double age = keyboard.nextDouble();
		short femaleBmr = (short) (655+(4.3 * weight) + (4.7 * height) - (4.7 * age));
		short maleBmr = (short) (66+(6.3 * weight) + (12.9 * height) - (6.8 * age));
		System.out.println("if you are a female you can eat: ");
		System.out.println(femaleBmr/230);
		System.out.println("Chocolate Bars to maintain your weight:");
		System.out.println("if you are a male you can eat:");
		System.out.println(maleBmr/230);
		System.out.println("Chocolate Bars to maintain your weight");
		
		
		


		
		// TODO Auto-generated method stub

	}

}
