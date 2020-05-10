import java.util.Scanner;

/*
 * Create variables for ones, tens, hundreds, and thousands place
 * set the pre-established conditions for ones, tens, hundreds, and thousands place
 * set Max and Min to 9999 and 1000 respectively
 * have program loop through all numbers between max and min to find those that meet the conditions
 */



public class A5skhanBatman {
  
  
  public static void main(String[] args) { 
Scanner keyboard = new Scanner(System.in);
int address = 0;
int ones = 0;
int tens;
int hundreds;
int thousands = 0;

final int MINIMUM = 1000;
final int MAXIMUM = 9999;

boolean sumIs27 = false;
boolean oddOne = false;
boolean threeThousand = false;
boolean randomFourDigits = false;

while (!randomFourDigits &&  !threeThousand && !oddOne && !sumIs27) {
	
	address = (int)(Math.random()*(MAXIMUM-MINIMUM)+MINIMUM);
	
	thousands = (address/1000) % 10;
	hundreds = (address/100) % 10;
	tens = (address/10) % 10;
	ones = (address%10) % 10;

	if ((thousands != hundreds) && (thousands != tens) && (thousands != ones) && (hundreds != tens))
			randomFourDigits = true;
	if (randomFourDigits && (thousands ==3 * tens))
	{
		threeThousand = true;
		
	if ((ones != 0) && (ones != 2) && (ones != 4) && (ones != 6) && (ones != 8))
	{
		oddOne = true;
	if ((thousands + hundreds + tens + ones) == 27)
		sumIs27 = true;
	else
	{
		 sumIs27 = false;
		 oddOne = false;
		 threeThousand = false;
		 randomFourDigits = false;
	}
	
	}	
	else
	{
		randomFourDigits = false;
		threeThousand = false;
		oddOne = false;	
	}
	}
	else
	{
		randomFourDigits = false;
	}
	}
	System.out.println("The number is: "+address);  
  }
}