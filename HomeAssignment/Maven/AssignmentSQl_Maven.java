import java.sql.*;



public class AssignmentSQl_Maven {
	static Connection con;
	static void Connection() throws Exception {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo","root","12345678");
	}
	public static void main(String[] args) {
		AssignmentSQl_Maven obj =new AssignmentSQl_Maven();
		try {
			Connection();
			PreparedStatement s1 = con.prepareStatement("select * from Student");
	 		ResultSet rs = s1.executeQuery();
	 		System.out.println("Details shown");
	 		while(rs.next()){  
	 			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
	 			}  
	 		con.close();
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
