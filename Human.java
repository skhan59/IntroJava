//human is a type of creature so it will extend the creature class
//humans have a name, an amount of health, and an amount of strength
//

import java.util.Random;

public class Human extends Creature {
	
	public Human(String n, int h, int s) {
		setName(n);
		setHealth(h);
		setStrength(s);
		
	}
	
	//constructor made to store humans into the array of fellowship members in the tester class
	public Human(Human name) {
		Human rag = new Human("Arag", 100, 25); 
		Human bor = new Human("Boro", 150, 20); 
		Human far = new Human("Fara", 80, 30); 
	}

	@Override
	public int getDamage() {
		Random random = new Random();
		return random.nextInt(getStrength()/2) + 1 + getStrength()/2;
	}
}