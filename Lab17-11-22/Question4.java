package sql;

import java.io.*;
import java.sql.*;

public class Question4 {
	public static Connection  getConnection() throws Exception {
		 Class.forName("com.mysql.jdbc.Driver");  
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","12345678");
	    return con;
	}
	 public static void main(String[] args) throws IOException {
	       
	        try {
	        	File f=new File("emp.txt");  
	        	FileReader fr=new FileReader(f);  
	        	Connection con = getConnection();
	        	System.out.println("connected ");  
	        	PreparedStatement pstmt=con.prepareStatement("insert into emp2(id, fileName, fileBody) values (?, ?, ?)");
	        	 pstmt.setString(1, "020");
	             pstmt.setString(2, "emp.txt");
	             System.out.println("connected-2 ");  
	             pstmt.setCharacterStream(2,fr,(int)f.length());
	             System.out.println("connected-3 ");  
	             int i=pstmt.executeUpdate();  
	             System.out.println(i+" records affected");  
	               
	        	 con.close();  
	        	               
	             pstmt.close();
	             
	             con.close();
	        }catch (Exception e) {
				// TODO: handle exception
	        	 System.err.println("Error: " + e.getMessage());
	            
			}
	        
	        System.out.println("Done");
	 }
}

