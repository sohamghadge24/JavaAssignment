package lab27;
//create emp details eid,ename,sal and store in "emp.txt" file
import java.io.*;

public class Question1 {
	public static void main(String[] args) {
		empDetail emp1=new empDetail(1,"Soham",500000);
		emp1.createFile();
		
	}
}

class empDetail{
	int eid,Salary;
	String ename;
	empDetail(int eid,String ename,int Salary){
	this.eid=eid;
	this.ename=ename;
	this.Salary=Salary;
	}
	void createFile(){
		 try {
		      FileWriter myWriter = new FileWriter("/Users/soham/Documents/emp.txt");
		      myWriter.write("Detail of employee");
		      myWriter.write("\nEmployee id :"+eid+"\n Employee name :"+ename+"\n Employee Salary"+Salary);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      e.getMessage();
		    }
	}
}
