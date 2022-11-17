package sql;
//(Create, Read, Update and Delete) 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JavaConnecterMain {
	String Name = null, Course  =null;
	int fees = 0;
	static int a;
	Scanner sc =new Scanner(System.in);
	
	void info() {
		System.out.println("Select Operation to :");
		System.out.println("1.Create\n2.Read\n3.Update\n4.Delete\n5.Display");
		System.out.print("Enter a number :");
		 a=sc.nextInt();
		if(a!=5) {
		System.out.println("Enter Student Name:");
		Name =sc.next();
		}
		if(a==1||a==3){
			System.out.println("Enter Course Name:");
			Course =sc.next();
		}
		if(a==1) {
			System.out.println("Enter Course Fees:");
			fees =sc.nextInt();
		}
	} 
	
	public static void main(String args[]){  
		Scanner sc =new Scanner(System.in);
		JavaConnecterMain obj=new JavaConnecterMain();
			try{  
			
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo","root","12345678");
					do {
						obj.info();
						switch (a) {
						case 1:
							//create
							PreparedStatement stmt=con.prepareStatement("INSERT INTO info values (?,?,?)");  
							stmt.setString(1, obj.Name);
							stmt.setString(2, obj.Course );
							stmt.setInt(3, obj.fees);
							int i=stmt.executeUpdate();  
							System.out.println(i+" records created");  

							break;
						case 2:
							//delete
							PreparedStatement stmt1=con.prepareStatement("Select * from info where Sname=?");  
							stmt1.setString(1, obj.Name);
							System.out.println("Search records:");  
							ResultSet rs=stmt1.executeQuery();  
							while(rs.next())  
							System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getInt(3));  
												
							break;
						
						case 3:
							PreparedStatement Stml2=con.prepareStatement("update info set Cname=? where Sname=?");  
							Stml2.setString(2, obj.Name);
							Stml2.setString(1, obj.Course );
							
							int i1=Stml2.executeUpdate();  
							System.out.println(i1+": records update");  
							break;
						
						case 4:
							PreparedStatement stml3=con.prepareStatement("delete from info where Sname=?");  
							stml3.setString(1, obj.Name);
							
							int j=stml3.executeUpdate();  
							System.out.println(j+": records delete");  
							break;
						case 5:
							PreparedStatement stmt4=con.prepareStatement("Select * from info");  
							ResultSet rs1=stmt4.executeQuery();  
							while(rs1.next())  
							System.out.println(rs1.getString(1)+"  "+rs1.getString(2)+" "+rs1.getInt(3));  
							break;

						default:
							System.out.println("Illegal number ");
							break;
						}
					System.out.println("Do you want to continue: y/n");  
					String s=sc.nextLine();  
					if(s.startsWith("n")){  
					break;  
					}  
					}while(true);  
				con.close();  
			}
			catch(Exception e)
			{ 
				System.out.println(e);
			}  
		}

	
}
