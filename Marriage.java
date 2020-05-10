
public class Marriage {
	private static int nextMarriageNumber = 1000;
	
	private int marriageNumber;
	
	public Marriage(){
		marriageNumber = nextMarriageNumber;
		nextMarriageNumber++;
	}
	
	public String toString(){
		String ret;
		ret = "Marriage Number M"+ marriageNumber + " between these people: ...";
		return ret;
	}

}
