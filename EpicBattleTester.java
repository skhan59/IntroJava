//main will take 7 non-dragon creatures and have them be apart of the fellowship
//the fellowship will combat a Dragon until the dragon loses all its health or the fellowship all loses its health
//if the health for either the fellowship or dragon reaches 0, then they will be dead and the fight will end

public class EpicBattleTester {

	public static void main(String[] args) {
		Creature[] fellowship = new Creature[7];
		Hobbit frod = new Hobbit("Frod", 50, 10); 
		Hobbit sam = new Hobbit("Sam", 75, 5); 
		Human rag = new Human("Arag", 100, 25); 
		Human bor = new Human("Boro", 150, 20); 
		Human far = new Human("Fara", 80, 30); 
		Hobbit pip = new Hobbit("Pipp", 30, 4); 
		Hobbit mer = new Hobbit("Merr", 30, 4);
		fellowship[0] = new Hobbit(frod);
		fellowship[1] = new Hobbit(sam);
		fellowship[2] = new Human(rag);
		fellowship[3] = new Human(bor);
		fellowship[4] = new Human(far);
		fellowship[5] = new Hobbit(pip);
		fellowship[6] = new Hobbit(mer);




		Dragon dragon = new Dragon("Smog", 500, 30);
		
		while (true) {
			System.out.println(frod+","+sam+","+rag+","+bor+","+far+","+pip+","+mer);
			System.out.println(dragon);
			dragon.fight(fellowship[0]);
			dragon.fight(fellowship[1]);
			dragon.fight(fellowship[2]);
			dragon.fight(fellowship[3]);
			dragon.fight(fellowship[4]);
			dragon.fight(fellowship[5]);
			dragon.fight(fellowship[6]);
			
			
			if (dragon.getHealth() <= 0) {
				System.out.println("The fellowship has prevailed!");
				break;
			}
		}
	}
}