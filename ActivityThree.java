import java.util.Scanner;
public class ActivityThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int numOne = keyboard.nextInt();
		System.out.println("Enter another integer:");
		int numTwo = keyboard.nextInt();
		if (numTwo == 0) {
			System.out.println("Cannot divide by 0");	
		}	
		if (numTwo >= numOne) {
			System.out.println("The second integer is greater than "
					+ "or equal to the first");								
		}
		else System.out.println(numOne+" divided by "+numTwo+" is: "+numOne/numTwo );
		keyboard.close();		
	}
}
