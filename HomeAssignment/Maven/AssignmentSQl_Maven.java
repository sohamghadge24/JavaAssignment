import java.sql.*;
import java.util.Scanner;

class Information{
	private String name;
	private int marks,id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

public class AssignmentSQl_Maven {
	static Connection con;
	Information obj=new Information();
	static Scanner sc=new Scanner(System.in);
	
		void getInfo() {
			System.out.println("Enter id:");
			int a=sc.nextInt();
			obj.setId(a);
			System.out.println("Enter name: ");
			String b=sc.next();
			obj.setName(b);
			System.out.println("Enter marks:");
			int c=sc.nextInt();
			obj.setMarks(c);
		}
		
		
		static void Connection() throws Exception {
			// TODO Auto-generated method stub
			 Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo","root","12345678");
		}
		public static void main(String[] args) {
			AssignmentSQl_Maven obj1 =new AssignmentSQl_Maven();
			try {
				Connection();
				obj1.read();
				System.out.println("Do u want to update Values: ");
				System.out.println("Do u want to insert or elements: y/n");
				String a=sc.next();
				if(a.equalsIgnoreCase("y"))
					obj1.update();
				
		 		con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		void read(){
			PreparedStatement s1;
			try {
				s1 = con.prepareStatement("select * from Student");
				ResultSet rs = s1.executeQuery();
		 		System.out.println("Details shown");
		 		while(rs.next()){  
		 			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
		 			}  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		
		}
		
		void update() {
			AssignmentSQl_Maven obj1 =new AssignmentSQl_Maven();
			try {
				String a; 
				do {
					
				obj1.getInfo();
				PreparedStatement stmt1=con.prepareStatement("INSERT INTO Student values (?,?,?)");
				stmt1.setInt(1, obj.getId());
				stmt1.setString(2, obj.getName() );
				stmt1.setInt(3, obj.getMarks());
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
Details shown
0 null 0
0 null 0
0 null 0
123 Soham 90
321 Ayush 89
432 Priya 89
*/
