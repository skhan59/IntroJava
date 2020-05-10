/*
 * Ask the user to enter a string
 * take the user's string and print it out backwards
 * keep asking the user if they want to enter a new string and each time they say yes, print out the string backwards
 * When the user says no, print out the total number of strings they entered into the program and end said program
 */
import java.util.Scanner;
public class p1skhanReverse
{
   public static void main(String args[])
   {
	Scanner keyboard = new Scanner(System.in);
    boolean newString = false;
    int count = 1;
      String originalString;
      String reversedString = "";
      String keepGoing;
      do {
      System.out.println("Enter a string: ");
      originalString = keyboard.nextLine();
      int length = originalString.length();
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reversedString = reversedString + originalString.charAt(i); 
      System.out.println("The reverse of this string is: "+reversedString);
      System.out.println("Would you like to enter another string? Y or N. ");
      System.out.println();;
      reversedString = "";
      keepGoing = keyboard.nextLine();
      while(!keepGoing.equals("Y") && !keepGoing.equals("N") && !keepGoing.equals("y") && !keepGoing.equals("n")){
          System.out.println("Invalid input. Please enter Y, y, N, or n.");
          keepGoing = keyboard.nextLine();
      }
      if (keepGoing.equals("Y") || keepGoing.equals("y")){
          newString = true;
          count +=1;
      }
      else if(keepGoing.equals("N") || keepGoing.equals("n")){
          newString = false;
          System.out.println("You entered " + count + " total strings. \nNo new string desired, ending program.");
      }
      }while(newString);
  }
}