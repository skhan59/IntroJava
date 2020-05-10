public class PandMMain {

	public static void main(String[] args) {
		l9Person p1;
		l9Person p2;
		l9Person p3;
		l9Person p4;
		Marriage m1;
		Marriage m2;
		
		p1 = new l9Person();
		p2 = new l9Person("Smity", "Will James", 30, 10, 1980);
		p3 = new l9Person("Jones", "Susan", 15, 11, 1980);
		p4 = new l9Person("James", "John", 8, 11, 2003);
		

		//System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p4.setParents(p2, p3);
		p4.getParents();
		
		
/*
 * NOTE:  all code above this point is just my attempt to show that it compiles and runs
 * 			you can keep it, modify it, or delete it as you wish		
 */
		
		/*
		 * Add here to main and/or in the separate .java class files as appropriate
		 * NOTE:  You can add or modify as you wish all the other classes provided as starting points
		 * 1. Create a class Registry that is a collection of Person objects
		 * 		(see any starter code provided)
		 * 2. From main create a registry object
		 * 3. Add at least three people objects  to the registry
		 * 4. In a sentinel loop prompt the user for the name of a person to look up in the registry
		 * 		or quit when they enter STOP
		 * 5. For each input from the user, print out Found or Not Found.  If found give the details for the person
		 * 6. Optionally, add more  (record marriage, end marriage, print out full registry....)
		 * 
		 * Hint:  I suggest you consider a .equals method for Person class
		 */
/*
 * Requirements:  what you turn in must compile and run
 * You need NOT do everything; you need NOT have all features
 * BUT you must have at minimum suitable signatures and some stub code for all methods
 * the minimum is enough to see how the code should work ("See the foot steps for the programmer to take")		
 */
		
	}

}
