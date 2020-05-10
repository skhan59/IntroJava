public class Dates {
	private int Day;
	private int Month;
	private int Year;

	public static int numberOfDates = 0;
	
	
public Dates (int month, int day, int year) {

if(0 < day && day < 32) {
	this.Day = day;
}
if(0 < month && month < 13) {
	this.Month = month; 
}
if(0 < year && year < 9999) {
	this.Year = year;

}
numberOfDates++;
}


public void setDay (int day) {
	if(0 < day && day < 32) {
		this.Day = day;

}

}

public void setMonth (int month) {
	if(0 < month && month < 13) {
		this.Month = month;

}

}

public void setYear (int year) {
	if(0 < year && year < 9999) {
		this.Year = year;
}
}
public int getDay() {
	return this.Day;
}

public int getMonth() {
	return this.Month;
}

public int getYear() {
	return this.Year;
}
public String toString()
{
return Month + "/" + Day + "/" + Year;
}

public void equals(Dates other) {

if (Day == other.getDay() && Month == other.getMonth() && Year == other.getYear()) {
	System.out.println("equals"); 
} else {
	System.out.println("not equal");
}
	
}

public Dates() {
	Day = 22;
	Month = 9;
	Year = 2011;
}

public boolean isLessThan(Dates dateTwo) {
	if (this.Month < dateTwo.getMonth()) {
		return true;
	}
	else if (this.Month > dateTwo.getMonth()) {
		return false;
	}
	
	if (this.Day < dateTwo.getDay()) {
		return true;
	}
	else if (this.Day > dateTwo.getDay()) {
		return false;
	}
	if (this.Year < dateTwo.getYear()) {
		return true;
	}
	else if (this.Year > dateTwo.getYear()) {
		return false;
	}
	return false;

}


public boolean isLessThan(int month, int day, int year) {
	if (this.Month < month) {
		return true;		
}
	else if (this.Month > month) {
		return false;
	}
	if (this.Day < day) {
		return true;		
}
	else if (this.Day > day) {
		return false;
	}
	if (this.Month < month) {
		return true;		
}
	else if (this.Year > year) {
		return false;
	}
return false;
}


public Dates(Dates otherDates) {
	Day = otherDates.getDay();
	Month = otherDates.getMonth();
	Year = otherDates.getYear();
	numberOfDates++;	
}
	
	



}

