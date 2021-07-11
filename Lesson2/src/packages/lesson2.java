package packages;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;  
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.PrintWriter; 
public class lesson2 {
 
	 public static void main(String[] args) throws FileNotFoundException { 
		 
		 //write
		FileOutputStream RD = new FileOutputStream ("myfile.txt"); 
		PrintWriter PR = new PrintWriter (RD); 
		 
		PR.println(" yes java its the best"); 
		PR.close(); 
		System.out.println("File myfile.txt");  
		
		//Read a file  
		
		FileInputStream WT = new FileInputStream ("myfile.txt");  
		Scanner sc = new Scanner(WT);    
		
		while (sc.hasNext()) { 
			System.out.print(sc.nextLine());
		}
		
		
		
		
	 }
	
}