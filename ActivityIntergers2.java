import java.util.Scanner;
public class ActivityIntergers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int numOne = keyboard.nextInt();
		System.out.println("Enter another integer:");
		int numTwo = keyboard.nextInt();
		
		if (numOne > numTwo) {
			System.out.println(numOne);
						
			
		}
		
		if (numTwo > numOne) {
			System.out.println(numTwo);
									
		}
		
		if (numOne == numTwo) {
			System.out.println("equal");						
			
		}

	}

}
