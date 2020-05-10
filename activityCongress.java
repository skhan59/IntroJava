import java.util.Scanner;
public class activityCongress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter your age:");
        int age = keyboard.nextInt();
        System.out.println("Enter how long you've been a citizen:");
        int citizen = keyboard.nextInt();
        boolean eligibility = false;
       
        if (age > 24 && citizen > 6)
        	eligibility = true;
        if (age < 25 && citizen < 7)
        	eligibility = false;
        
        while (eligibility) {
        	if (eligibility = true)
        		System.out.println("You are eligible to run for the House of Representatives");
    	    System.out.println("Enter your age:");
    	    int ageAgain = keyboard.nextInt();
    	    System.out.println("Enter how long you've been a citizen:");
    	    int citizenAgain = keyboard.nextInt();
    	    if (ageAgain > 24 && citizenAgain > 6)
            	eligibility = true;
    	    else
    	    	eligibility = false;
    	    if (eligibility = false)
        		System.out.println("You are ineligible to run for the House of Representatives");

    	    	
            

        	
        	
        	
        	
        }
        
        


	}

}
