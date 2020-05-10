
public class AnimalMainTester {

	public static void main(String[] args) {
		AnimalWing animal1 = new AnimalWing(100, 1000);
		Animal animal2 = new AnimalLand(150, 4);
		animal1.eat();
		animal2.eat();
		
		System.out.println("animal1: " + animal1.getWeight() + " " + animal1.getFlyHeight());
		System.out.println("animal2: " + animal2.getWeight() + " " + ((AnimalLand)animal2).getNumLegs());
	}
}
