public abstract class Pet {
	private String name;
	private int happinessLevel;
	
	
	public int getHappinessLevel() {
		return happinessLevel;
	}

	public void setHappinessLevel(int happinessLevel) {
		this.happinessLevel = happinessLevel;
	}
		
	
public void play(Pet otherPet) {
	setHappinessLevel(getHappinessLevel() + 1);
}


	
	
	
	
	
	
	
}