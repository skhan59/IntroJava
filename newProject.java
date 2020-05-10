/*
 * Ask if you want to enter a grade
 * 
 *  
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class newProject {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to enter your grade? "
        		+ "Enter Y for Yes, or N for No.");
        String studentsChoice = keyboard.next();
        boolean YesorNo = false;
        
        if (studentsChoice.equalsIgnoreCase("Y"))
        YesorNo = true;
        if (studentsChoice.equalsIgnoreCase("N"))
        YesorNo = false;
        ArrayList grades = new ArrayList();
        int sum = 0;
        
        while(YesorNo)
        {
            System.out.println("Enter grade for the student:");
            int grade = keyboard.nextInt();
            grades.add(grade);
            sum += grade;
            keyboard.nextLine();
            System.out.println("Do you want to enter your grade?");
            String goAgain = keyboard.nextLine();
            if (goAgain.equalsIgnoreCase("Y")) 
            	YesorNo = true;
            else YesorNo = false;
            
        }
        
        Object maximum = Collections.min(grades);
        Object minimum = Collections.max(grades);
        Object average = sum/grades.size();
                 
            }
}
        