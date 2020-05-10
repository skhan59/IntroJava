
public class booksoriginal {
	private String title;
	private String author;
	private int pages;
	private int publicationYear;
	private  int readingPosition;
	
	//constructor one
	public Books() {
		title = "Harry Potter";
		author = "JK Rowling";
		pages = 163;
		publicationYear = 2000;
		readingPosition = 1;
	}
	
	
	public Books(String title, String author, int pages, int publicationYear, int readingPosition) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.publicationYear = publicationYear;
		this.readingPosition = readingPosition;
		
	}
	
	public void updatePage(int p) {
		if (p > pages || p < 1) {
			System.out.println("Not a reading position");
		} else {
			readingPosition = p;
				
	}
		
		
		
}
	
	public int getReadingPosition() {
		return readingPosition;
	}
	
	public String toString() {
		
		return this.pages+","+this.author+
		
		
		
	}
	
	
			
		}
		
		
	
	
	
	
	
	
	


