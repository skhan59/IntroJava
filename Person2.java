import java.time.LocalDate;

public class Person2 {
	private int weight;
	private int height;
	private String name;
	private static int numInstances;
	private Dates birthday;
	private Dates anniversary;
	

		
	public void setBirthday(Dates that) {
		
	}
	
	public void getBirthday() {
		
	}
	
	//Default constructor
	public Person() {
		weight = 100;
		height = 60;
		name = "Nobody";
		birthday = new Dates();
		numInstances++;
	}

	public Person(int weight, int height, String name, Dates birthday) {
		//calls the mutator functions, which have error checking in them
		setWeight(weight);
		setHeight(height);
		setName(name);
		numInstances++;
	}
		
	public static int getNumInstances() {
		return numInstances;
	}

	public void eat() {
		weight++;
	}

	public void eat(int extraPounds) {
		weight += extraPounds;
	}
	
	public void eat(double extraPounds) {
		
	}

	//mutator function for name variable
	public void setName(String name) {
		this.name = name;
	}

	//accessor function for name variable
	public String getName() {
		return name;
	}

	//mutator function for weight variable
	public void setWeight(int weight) {
		if (weight >= 1 && weight < 1000) {
			this.weight = weight;
		}
	}

	//accessor function for weight variable
	public int getWeight() {
		return weight;
	}

	//mutator for height variable
	public void setHeight(int h) {
		if (h >= 1 && h <= 120) {
			height = h;
		}
	}

	//accessor for height variable
	public int getHeight() {
		return height;
	}

	//converts Person object to String
	//can be used in System.out.println
	public String toString() {
		return name + " weighs " + weight + " pounds and is " + height + " inches";
	}

	//Overwrite equals() method to compare if two
	//Person objects are the same
	public boolean equals(Person otherPerson) {
		if (weight == otherPerson.getWeight() &&
				height == otherPerson.getHeight() &&
				name.equals(otherPerson.getName())) {
			return true;
		} else {
			return false;	
}
		
	}
}
