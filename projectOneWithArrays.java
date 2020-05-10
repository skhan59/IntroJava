import java.util.Scanner;
import java.util.ArrayList; 
public class projectOneWithArrays {
	/*
	 * Ask the user to enter a string
	 * take the user's string and print it out backwards
	 * keep asking the user if they want to enter a new string and each time they say yes, print out the string backwards
	 * When the user says no, print out the total number of strings they entered into the program and end said program
	 */
	public static String reverseString(String input) {
		// TODO Auto-generated method stub
		String reversedString = "";
		//We create a variable reversedString that will reverse any string once the user inputs a regular string that is forward
        int length = input.length();
        for (int i = length - 1; i >= 0; i--)
            reversedString = reversedString + input.charAt(i);
        //This will Reverse the String
        return(reversedString);
    }
    public static void main(String[] args) {
    	ArrayList<String > normalStrings = new ArrayList<>(); 
        boolean newString = false;
        String keepGoing;
        int count=1;
        Scanner sc = new Scanner(System.in);
        do{
        	//Use a Do-While loop to keep asking for the string from the user again and again
            System.out.println("Enter a string: ");
            String userInput = sc.nextLine();
            normalStrings.add(userInput);
            //add the original string the user inputs to the arraylist
            System.out.println("The reverse of these strings are: " + reverseArrayList(normalStrings));
            //Print out one string for the first time in Reverse from arrayList
            System.out.println("Would you like to enter another string? Y or N. ");
            System.out.println();;
            keepGoing = sc.nextLine();
            
            while(!keepGoing.equals("Y") && !keepGoing.equals("N") && !keepGoing.equals("y") && !keepGoing.equals("n")){
            	//A while statement that says that if the user inputs something other than the letters, "Y", "N", "y", "n", to keep entering another string,invalid statement printed
                System.out.println("Invalid input. Please enter Y, y, N, or n.");
                keepGoing = sc.nextLine();
                System.out.println();;
               
            }
            if (keepGoing.equals("Y") || keepGoing.equals("y")){
                newString = true;
                count +=1;
              //A counter basically counts the number of times the user is inputting something
            }
            else if(keepGoing.equals("N") || keepGoing.equals("n")){
                newString = false;
                System.out.println("You entered " + count + " total strings. \nNo new string desired, ending program.");
            }
            }while(newString);
        }
public static String reverseArrayList(ArrayList<String> strings)
{
	ArrayList<String> reverseStringHolder = new ArrayList<>();
	//This is an Empty array list but it will hold the Reverse string
	String printOut = " "; 
	//Print out all the reverse strings from array list
	for(int i = 0; i<strings.size(); i++)
		//Will go through array of strings that user is putting in
	{
		String reversedString = reverseString(strings.get(i)); 
		//Will get the string and reverse it
        reverseStringHolder.add(reversedString); 
        //add it to the arraylist
	}
    for (int i = 0; i < reverseStringHolder.size(); i++)
    	//This for loop is going to through the array list of REVERSED strings
    {
       printOut += reverseStringHolder.get(i) + " ";
       ////Adding reverse string from array list to the result string to make it look cleaner
    }
 return printOut; 
}
}