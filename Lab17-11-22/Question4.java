package sql;

import java.io.*;

public class Question4 {
	 public static void main(String[] args) throws IOException {
	        FileOutputStream file  = new FileOutputStream("emp.txt");
	        
	        PrintWriter p1 = new PrintWriter(file);
	        p1.println("Student name: - Soham");
	        p1.println("Student id: - 50");
	        p1.println("Student marks - 90");
	        p1.println("Student course - Java");
	        p1.close();
	        System.out.println("Done");
	 }
}
