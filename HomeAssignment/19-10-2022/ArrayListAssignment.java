package Assignment2;


import java.util.*;

public class ArrayListAssignment {
	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Parag",200000); 
		Employee emp2=new Employee(2,"Nive",100000); 
		Employee emp3=new Employee(3,"Soham",500000); 
		Employee emp4=new Employee(4,"Riya",400000); 
		
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(emp1);
		e.add(emp2);
		e.add(emp3);
		e.add(emp4);
		Iterator itr=e.iterator();  
		while(itr.hasNext()){  
			Employee st=(Employee)itr.next();  
		    System.out.println(st.eid+" "+st.name+" "+st.Salary);  
		  }  
	

	}
}
class Employee{
	int eid ;  
	String name;  
	int Salary;  
	Employee(int eid,String name,int Salary){  
	   this.eid=eid;  
	   this.name=name;  
	   this.Salary=Salary;  
	  }  

}

/*
output: 
    1 Parag 200000
    2 Nive 100000
    3 Soham 500000
    4 Riya 400000


*/
