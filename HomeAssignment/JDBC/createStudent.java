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
/*
output:
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Enter Student Name:
Soham
Enter sid:
123
Enter marks:
90
1 records created
Do u want to insert or elements: y/n
y
Enter Student Name:
Ayush
Enter sid:
321
Enter marks:
89
1 records created
Do u want to insert or elements: y/n
y
Enter Student Name:
Priya
Enter sid:

432
Enter marks:
89
1 records created
Do u want to insert or elements: y/n
n

*/
