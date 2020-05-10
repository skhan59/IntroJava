import java.util.Scanner;
/*
 * Ask for day, time, and year and store them as variables
 * have months be as long as either 1-31 days or 1-30 days, depending on the month *excluding February* 
 * Have February be 1-28 days or 1-29 days depending on if it's a leap year or not
 * print out date in mm/dd/year format
 */
public class A4skhanDate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a month numerically: ");
		int month = keyboard.nextInt();
		System.out.println("Enter a day numerically: ");
		int day = keyboard.nextInt();
		System.out.println("Enter a year: ");
		int year = keyboard.nextInt();
		System.out.println(month+"/"+day+"/"+year);	
		
		if ((month == 0) || (month > 12)) 
			System.out.println("Invalid because the month can't"
					+ " exceed 12, or be 0");
		if ((day == 0) || (day >= 31 && (month == 4 || month == 6 || month == 9 || month == 11)) ) 
			System.out.println("Invalid because September, April, November and June "
					+ " can only have 1 to 30 days ");
		if ((day == 0) || (day >= 32 && (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month ==12)) ) 
			System.out.println("Invalid because January, March, as well as"
					+ " May and July-August and October-December"
					+ " can only have 1 to 31 days");
		boolean leapYear; {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 ))		
			leapYear = true;
		
		else
			leapYear = false;	
		if (month == 2 && !leapYear && (day > 28 && day < 1))
			System.out.println("Invalid, On non leap years, February can only have"
					+ " 1-28 days"); 
		
		else if (month == 2 && leapYear && (day > 29 && day < 1))
			System.out.println("On leap years February can only have 1-29 days");
	}
	}
}
