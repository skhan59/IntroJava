import java.util.Scanner;
public class DateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Dates Dates1 = new Dates(11, 16, 1984);
		Dates Dates2 = new Dates(10, 29, 2018);
		Dates Dates3 = new Dates(11, 12, 2001);
		Dates Dates4 = new Dates(12, 25, 2009);
		Dates Dates5 = new Dates(03, 11, 2013);
		
		System.out.println(Dates1);
		System.out.println(Dates2);
		System.out.println(Dates3);
		System.out.println(Dates4);
		System.out.println(Dates5);
		
		Dates1.setDay(31);
		Dates1.setMonth(11);
		Dates1.setYear(2017);
		
		Dates2.setDay(15);
		Dates2.setMonth(10);
		Dates2.setYear(2018);
		
		System.out.println(Dates1);
		System.out.println(Dates2);
		
		Dates1.equals(Dates2);
		
		Dates1.isLessThan(Dates2);
		
		if (Dates1.isLessThan(Dates2)) {
			System.out.println(Dates1);
	} else {
	
		System.out.println(Dates2);
	}


	}

	
	
}
