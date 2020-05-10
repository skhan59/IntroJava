import java.util.Scanner;
public class ActivityInteger {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = keyboard.nextInt();
		if (number >= 100) {
			System.out.println(number+" is greater than 100");
						
			
		}
		
		else System.out.println("Less than 100");


		keyboard.close();


	}

}
