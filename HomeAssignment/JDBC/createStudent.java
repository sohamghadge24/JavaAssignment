package homeAssignmnent;

import java.sql.*;
import java.util.*;

public class createStudent {
	String Name = null;
	int marks,sid;
	static int a;
	Scanner sc =new Scanner(System.in);
	void info() {	
		System.out.println("Enter Student Name:");
		Name =sc.next();
		
		System.out.println("Enter sid:");
		sid =sc.nextInt();
		
		System.out.println("Enter marks:");
		marks =sc.nextInt();
		
	} 
	public static void main(String[] args) {
		String a;
		Scanner sc =new Scanner(System.in);
		try {
			createStudent obj=new createStudent();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo","root","12345678");
			//Statement stmt=con.createStatement();  
			//sid,sname,marks
			
	
			do {
				obj.info();
				PreparedStatement stmt1=con.prepareStatement("INSERT INTO Student values (?,?,?)");
				stmt1.setInt(1, obj.sid);
				stmt1.setString(2, obj.Name );
				stmt1.setInt(3, obj.marks);
				int i=stmt1.executeUpdate();  
				System.out.println(i+" records created");  
				System.out.println("Do u want to insert or elements: y/n");
				a=sc.next();
			} while (a.equalsIgnoreCase("y"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
}
