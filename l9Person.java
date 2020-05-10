import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.LocalDate;

public class l9Person {

	private String familyName;		//a single family name
	private String givenNames;		//one or more given names   
	private LocalDate dob;
	private int ssn;  //max value 10**9; -1 > not assigned
	private String priorName;
	private LocalDate nameChangeDate;
	private Marriage marriage;
	private Marriage myMarriage;
	private l9Person parent1;
	private l9Person parent2;
	ArrayList<l9Person> child = new ArrayList<>();
	
	public l9Person() {
		familyName = "";
		givenNames = "";
		dob = null;
		ssn = -1;
		priorName = "";
		nameChangeDate = null;
		marriage = null;
		parent1 = null;
		parent2 = null;
		
		

	}
	
	public void setParents(l9Person dad, l9Person mom) {
		parent1 = dad;
		parent2 = mom;
		parent1.setChild(this);
		parent2.setChild(this);
		
	}
	
	public void getChildArrayList () {
		for (int i = 0; i <= child.size(); i++)
			System.out.println(child.get(i));		
	}
		
	
	
	public void setChild(l9Person Child) {
	child.add(Child);	
	}
	
	public l9Person(String fN, String gNs,  int birthDay, int birthMonth, int birthYear) {
		familyName = fN;
		givenNames = gNs;
		dob = LocalDate.of(birthYear, birthMonth, birthDay);
		ssn = -1;
		nameChangeDate = null;
		priorName = "";	
	}

	public int getAgeInYears() {
		int age;
		age = (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
		return age;
	}
	
	public boolean isEighteenOrOver() {
		LocalDate ageEighteen;
		ageEighteen = dob.plusYears( 18 ); //Person's 18th birthday
		return !(ageEighteen.isAfter( LocalDate.now())); //age 18 is in past or today for Person
	}
	
	public String toString(){
		String ret;
		ret = "Person " + familyName.toUpperCase() + "/" + givenNames + "/" + dob + "/" + this.getAgeInYears() + "/" + this.isEighteenOrOver() + "/";
		return ret;
	}
	
	public void getParents () {
		System.out.println(parent1.getName());
		System.out.println(parent2.getName());
		
	}
	public String getName() {
	return givenNames;	
	}
	
}
	
	