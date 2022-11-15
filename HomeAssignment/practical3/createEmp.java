package homeAssignmnent;

import java.sql.*;
import java.util.*;

public class createEmp {
	String Name = null;
	int salary,eid;
	static int a;
	Scanner sc =new Scanner(System.in);
	void info() {	
		System.out.println("Enter Employee Name:");
		Name =sc.next();
		
		System.out.println("Enter Employee id:");
		eid =sc.nextInt();
		
		System.out.println("Enter salary:");
		salary =sc.nextInt();
		
	} 
	public static void main(String[] args) {
		String a;
		Scanner sc =new Scanner(System.in);
		try {
			createEmp obj=new createEmp();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","12345678");
			//Statement stmt=con.createStatement();  
			//sid,sname,marks
			
	
			do {
				obj.info();
				PreparedStatement stmt1=con.prepareStatement("INSERT INTO emp values (?,?,?)");
				stmt1.setInt(1, obj.eid);
				stmt1.setString(2, obj.Name );
				stmt1.setInt(3, obj.salary);
				int i=stmt1.executeUpdate();  
				
				System.out.println("Do u want to insert or elements: y/n");
				a=sc.next();
			} while (a.equalsIgnoreCase("y"));
			System.out.println(" records created Successfuly");  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
}
/*
output:
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Enter Employee Name:
Soham
Enter Employee id:
123
Enter salary:
900000
1 records created
Do u want to insert or elements: y/n
y
Enter Employee Name:
Riya
Enter Employee id:
190
Enter salary:
200000
1 records created
Do u want to insert or elements: y/n
y
Enter Employee Name:
Priya
Enter Employee id:
234
Enter salary:
300000
1 records created
Do u want to insert or elements: y/n
n
*/


/*
SQL-table 
'123','Soham','900000'
'190','Riya','200000'
'234','Priya','300000'
*/
