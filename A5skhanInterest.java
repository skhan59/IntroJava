import java.util.*;
/*
 * Ask for initial balance and interest rate
 * create loops that calculate the balance after interest rate is compounded monthly, daily, and yearly
 * ask the user if they want to go again, and if they say yes have the program loop and start over
 */
 public class A5skhanInterest
 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double balance;
        double interestRate;
        double annual;
        double monthly;
        double daily;
        double value;
        double year;
        String goAgain;
        
       
        do {
        System.out.println("Enter your account balance: ");
        balance = keyboard.nextDouble();
        
        System.out.println("Enter the interest rate: ");
        interestRate = keyboard.nextDouble();
        
        value = 1;
        year = 0;
        while(year<10) 
        {
        	value = value * (1 +(interestRate/100));
        	year++;
        }
        annual = balance * value;
        
        value = 1;
        year = 0;
        while(year<(10*12)) {
        	value = value * (1 + (((interestRate/12)/100)));
        	year++;
        }
        monthly = balance * value;
        
        value = 1;
        year = 0;
        while(year<(10*365)) {
        	value = value * (1 + ((interestRate/365)/100));
        	year++;
        }
        
        daily = balance * value;
        
     
        System.out.println("The value of the balance compounded annually is "+annual);
        System.out.println("The value of the balance compounded monthly is "+monthly);
        System.out.println("The value of the balance compounded daily is "+daily);
        
        System.out.println("Do you want to enter new information? "
        		+ "Enter Y for yes, or N for no.");
        goAgain = keyboard.next();
    }
    while (goAgain.equalsIgnoreCase("Y"));        
    }
}
