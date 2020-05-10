
public class AnimalLand extends Animal {
	private int numLegs;
	
	public AnimalLand(double weight, int nLegs) {
		setWeight(weight);
		setNumLegs(nLegs);
	}
	
	public int getNumLegs() {
		return numLegs;
	}
	
	public void setNumLegs(int n) {
		numLegs = n;
	}
	
	public void eat() {
		setWeight( getWeight() + 5 );
	}
}