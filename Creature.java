//Creature class will store something's name, the amount of health they have, and how strong they are
//Creature class will be used/extended by Humans and Hobbits

import java.util.Random;

public abstract class Creature {
	private String name;
	private int health;
	private int strength;
	
	
	//TODO private variables
	
	
	public int getDamage() {
		Random random = new Random();
		int x = random.nextInt(strength);
		return x;
 
	}
	
	public String toString() {
		return name + ":" + health;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	
	public void setStrength(int s) {
		strength = s;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
}