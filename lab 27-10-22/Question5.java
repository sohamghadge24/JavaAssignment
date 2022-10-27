package lab27;
//Write a program with PrintWriter class and store different data details into "abc.txt" file?

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question5 {
	public static void main(String[] args) {
		 PrintWriter writer1;
		try {
			writer1 = new PrintWriter(new File("/Users/soham/Documents/abc.txt"));
			writer1.write("I can do it. I am the Best.");                                                   
            writer1.flush();  
            writer1.close();  
            System.out.println("Successfully done");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}  
	}
}
/*
output :
Successfully done
*/
