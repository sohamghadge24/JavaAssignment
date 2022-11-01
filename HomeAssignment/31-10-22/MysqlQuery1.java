package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlQuery1 {
	public static void main(String args[]){  
		
			try{  
				int a = 0 ,b,c,total,avg,Sr_No = 0;
				String result;
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD1","root","12345678"); 
				
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from STUDENT");  
				while(rs.next()) {
				//	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getInt(9)+" "+rs.getInt(10)); 
					a=rs.getInt(5);
					b=rs.getInt(6);
					c=rs.getInt(7);
					total=a+b+c;
					avg=total/3;
					
					if(a>40 && b>40 && c>40) {
						result="PASS";
					}
					else
					{
						result="FAIL";
					}
					PreparedStatement n =con.prepareStatement("UPDATE STUDENT SET total =? , avg =?,result=?  WHERE Sr_No = ?; ");
					n.setInt(1, total);
					n.setInt(2, avg);
					n.setString(3,result);
					n.setInt(4, Sr_No);
					
					Sr_No++;
				
					int i=n.executeUpdate();  
				}
				//Sr_No Int,Sname varchar(20),course  varchar(20),Batch varchar(20),m1 int,m2 int,m3 int ,total int ,avg int, result int
				
				con.close();  
			}
			catch(Exception e)
			{ 
				System.out.println(e);
			}  
		}  

}
