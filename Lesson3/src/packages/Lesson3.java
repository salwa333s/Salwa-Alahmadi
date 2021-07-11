package packages; 

import java.io.FileNotFoundException;
import java.io.FileOutputStream;  
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.PrintWriter;  

public class Lesson3 {
 
	 public static void main(String[] args) throws FileNotFoundException { 
		 
		 //write in file
		FileOutputStream RD = new FileOutputStream ("myfile.txt"); 
		PrintWriter PR = new PrintWriter (RD); 
		 
		PR.println("Java Course"); 
		PR.close(); 
		System.out.println("File myfile.txt was written to");  
		
		//Read a file  
		
		FileInputStream WT = new FileInputStream ("myfile.txt");  
		Scanner sc = new Scanner(WT);    
		
		while (sc.hasNext()) { 
			System.out.print(sc.nextLine());
		}
		
		
		
	 }
	
}