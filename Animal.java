
public abstract class Animal {
	private double weight = 0;
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double w) {
		if (w > 0) {
			weight = w;
		}
	}
	
	public void eat() {
		weight++;
	}
}