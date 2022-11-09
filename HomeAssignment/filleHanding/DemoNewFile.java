package homeAssign;

import java.io.DataInputStream;
import java.io.*;

public class DemoNewFile {
	public static void main(String[] args) throws IOException {
		try {
			
			InputStream input = new FileInputStream("/Users/soham/Documents/demo.txt");  
		    DataInputStream inst = new DataInputStream(input);  
		    int count = input.available();  
		    byte[] ary = new byte[count];  
		    inst.read(ary);  
		    for (byte bt : ary) {  
		      char k = (char) bt;  
		      System.out.print(k+"-");  
		    }  
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error"+e.getMessage());
		}
	}
}
