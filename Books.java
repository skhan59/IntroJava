
public class Books {
	private String title;
	private String author;
	private int year;
	private int totalPages;
	private int readingPos;
	
	public Books(String title,String author, int year, int totalPages) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.totalPages = totalPages;
		readingPos = 0;
		
		
	}
	 
 public boolean upDateReadingPosition(int newPos) {
	 if(newPos <= totalPages) {
		 this.readingPos = newPos;
	 
	 return true;
 }
 	return false;
 }
 public String toString() {
 String output = title+","+author+","+year+","+totalPages;
 
 if(readingPos == totalPages) {
	 output = output + "Finished Reading";
 }
 else 
	 output = output+"at page"+readingPos;
return output;
			 
 }
}


