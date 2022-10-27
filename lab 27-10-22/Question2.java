package lab27;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question2 {
	void createFile(){
		 try {
		      FileWriter myWriter = new FileWriter("/Users/soham/Documents/ref.txt");
		      myWriter.write("Hello everyone,\n this is my ref.txt file");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      e.getMessage();
		    }
	}
	void readFile(){
		 try {
		      FileReader myReaderFile = new FileReader("/Users/soham/Documents/ref.txt");
		      Scanner myReader = new Scanner(myReaderFile);
		      System.out.println("text from ref.txt ");
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		      System.out.println("Successfully done");
		    } catch (IOException e) {
		      e.getMessage();
		    }
	}
	public static void main(String[] args) {
		Question2 obj=new Question2();
		obj.createFile();
		obj.readFile();
	}
}

/*
 * output
Successfully wrote to the file.
text from ref.txt 
Hello everyone,
 this is my ref.txt file
Successfully done
 * */

/*
file text:
Hello everyone,
 this is my ref.txt file
*/
