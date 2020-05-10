import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**Using simple text io to and from files
 * (Introduction to PrintWriter, FileOutputStream, Scanner, File classes)
 * @author W L Honig
 * @version 1.0
 *
 */
public class FilesMain {

	public static void main(String[] args) {
//
//Write a new file; overwrite an existing file
		PrintWriter output;
		 output = null;
		 try{
			 output = new PrintWriter("myFile.txt");
		 }
		 catch (FileNotFoundException e) {
			 System.out.println("Check file name please");
			 System.exit(1);
		 }
		 output.println("Line 1 is here!");
		 output.println("Line 2 comes next....");
		 output.println("This is not so hard at all.");
		 output.close();
		 System.out.println("File Written - check it!");
//
//Add to an existing file
		 FileOutputStream file;
		 file = null;
		 int count;
		 count = 0;
		 try{
			 file = new FileOutputStream("myFile.txt",true);
			 output = new PrintWriter(file);
		 }
		 catch (FileNotFoundException e) {
			 System.out.println("Cannot reopen file");
			 System.exit(2);
		 }
		 do {
			 output.println("Added line " + count + " to existing file.");
			 count++;
		 }
		 while (count <= 6 );
		 output.close();   //also closes the FileOutputStream
		 System.out.println("Lines added to file - check it!");
//
//Read all lines back into program		 
		 File inputFile;
		 Scanner input;
		 inputFile = null;
		 input = null;
		 int linesRead;
		 linesRead = 0;
		 try {
			 inputFile = new File("myFile.txt");
			 input = new Scanner(inputFile);
		 }
		 catch (FileNotFoundException e) {
			 System.out.println("Cannot open file for input");
			 System.exit(3);
		 }
		 System.out.println("Here's the current file contents. Should see " + inputFile.length() + " characters.");
		 while(input.hasNextLine()){
			 System.out.println(input.nextLine());
			 linesRead++;
		 }
		 input.close();
		 System.out.println("File finished with "+ linesRead + " lines read back!"); 
	}

}