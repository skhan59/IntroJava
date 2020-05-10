//Dragons are a type of creature so the class will extend the creature class
//Dragons will also have a name, amount of strength, and amount of health
//Dragons will attack the other two creatures
public class Dragon extends Creature {


	public Dragon(String n, int h, int s) {
		setName(n);
		setHealth(h);
		setStrength(s);
		
	}
	
	public void fight(Creature enemy) {
		enemy.getDamage();
		Dragon d1 = new Dragon(n, h, s);
		d1.getDamage();
		
	}

}
