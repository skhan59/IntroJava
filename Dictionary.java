//read word list one word at a time and then store it

import java.util.*;
import java.io.*;
public class Dictionary {
    public static void main(String[] args) {
        
        LinkedList<String> dictionary = new LinkedList<>();
        Scanner fileScanner;
        String word;
        
        try
        {
            fileScanner = new Scanner (new File("EnglishWordList.txt"));
            
            while (fileScanner.hasNext()) {
             word = fileScanner.nextLine();
             dictionary.add(word);
                
                
            }
            
        }
        
        catch (Exception e) {
            
            
            
            System.out.println("File not found");
        }
        System.out.println(dictionary.size());
        
    }
           
            
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

