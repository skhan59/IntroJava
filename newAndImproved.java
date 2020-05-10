import java.util.Scanner;
import java.util.ArrayList;

public class newAndImproved {
    /* Goal: Demonstrate how to reverse the characters in a string given user input.
     * We will do so using both string methods and ArrayLists to demonstrate the differences between the two data types.
     * Ask the user to enter a string
     * take the user's string and print it out backwards
     * keep asking the user if they want to enter a new string and each time they say yes, print out the string backwards
     * When the user says no, print out the total number of strings they entered into the program and end said program
     */
    public  static String reverseString(String input){
        String reversedString = "";
        int length = input.length();

        for (int i = length - 1; i >= 0; i--)
            reversedString = reversedString + input.charAt(i);
        return(reversedString);
    }

    public static String reverseArrayList(String userInput) //Array List was one of the ways our group thought of to complete the project
    
    {
        ArrayList<Character> characters = new ArrayList<>();
        String reversed = "";
        for(int i=0; i<userInput.length(); i++){
            characters.add((userInput.charAt((userInput.length()-i)-1))); 
        }
        for(char character:characters){
            reversed += character;
        }
        return reversed;
        }

    public static void main(String[] args) {
        ArrayList<String> allReversedStrings = new ArrayList<>();
        String output;
        boolean newString = false;
        boolean inputString = false;
        boolean inputArray = false;
        String keepGoing;
        int count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to demonstrate String method and 2 to demonstrate ArrayList method: ");
        String inputType = sc.nextLine();
        if(inputType.equals("1")){
            inputString = true;
            inputArray = false;
        }
        else if(inputType.equals("2")){
            inputArray = true;
            inputString = false;
        }
        else System.out.println("Please only enter 1 for String method and 2 for ArrayList method."); 
        do{
            System.out.println("Enter a string: ");
            String userInput = sc.nextLine();
            if(inputString){
                output = reverseString(userInput);
                System.out.println("The reverse of this string is: " + output);
                allReversedStrings.add(output);

            }
            else if(inputArray){
                output = reverseArrayList(userInput);
                System.out.println("The reverse of this string is: " + output);
                allReversedStrings.add(output);

            }
            System.out.println("Would you like to enter another string? Y or N. ");

            keepGoing = sc.nextLine();
            while(!keepGoing.equals("Y") && !keepGoing.equals("N") && !keepGoing.equals("y") && !keepGoing.equals("n")){
                System.out.println("Invalid input. Please enter Y, y, N, or n.");
                keepGoing = sc.nextLine();
            }
            if (keepGoing.equals("Y") || keepGoing.equals("y")){
                newString = true;
                count +=1;
            }
            else if(keepGoing.equals("N") || keepGoing.equals("n")){
                newString = false;
                System.out.println("No new string desired. Ending program.");
                System.out.println("You entered " + count + " total strings. Your outputs were: \n" + allReversedStrings);
            }
            }while(newString);
        }
    }
