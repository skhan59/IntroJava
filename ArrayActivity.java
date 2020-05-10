import java.util.Scanner;
public class ArrayActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int studentsTotal = keyboard.nextInt();
		double studentsArray[] = new double[studentsTotal];
		System.out.println("Enter a grade for each student: ");
		for(int i = 1; i <= studentsTotal; i++) {
			studentsArray[i] = keyboard.nextDouble();
			
		}
		
		


	
	}

}
