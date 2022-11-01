package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query3 {
	
		public static void main(String args[]){     
			try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD1","root","12345678");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery( "select * from STUDENT where result='pass' and course='SQL';");  
			while(rs.next())  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getInt(9)+" "+rs.getString(10)); 
			}
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  

	  

}
