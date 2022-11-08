package homeAssignmnent;

import java.io.*;
import java.util.*;

class Customer{
	int AcNo,amt;
	String  Cname,StoreInfo;
	Customer(int AcNo,String Cname,int amt,String StoreInfo){
		this.AcNo=AcNo;
		this.amt=amt;
		this.Cname=Cname;
		this.StoreInfo=StoreInfo;
	}
}

public class bankCustomer<T> {
	static Customer st;
	public static void main(String[] args) {
		Customer c1=new Customer(123,"Soham",100,"kalyan");
		Customer c2=new Customer(325,"Sanjay",200,"Thane");
		Customer c3=new Customer(424,"Vijay",300,"Mumbai");
		Customer c4=new Customer(521,"Jay",400,"kalyan");
		
		
		
		ArrayList<Customer> arraylists = new ArrayList<>();
		arraylists.add(c1);
		arraylists.add(c2);
		arraylists.add(c3);
		arraylists.add(c4);
		
		Iterator itr=arraylists.iterator();  
		while(itr.hasNext()){  
			 st=(Customer)itr.next();  
		    System.out.println(st.AcNo+" "+st.Cname+" "+st.amt+" "+st.StoreInfo);  
		    }
	}
	
}
/*output
123 Soham 100 kalyan
325 Sanjay 200 Thane
424 Vijay 300 Mumbai
521 Jay 400 kalyan
*/

