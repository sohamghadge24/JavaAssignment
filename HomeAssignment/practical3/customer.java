package collection;

import java.util.*;

public class customer {
	public static void main(String[] args) {
		
		 Collection<customerInfo> customer =new LinkedList<>();  
		 customer.add(new customerInfo(123,"Soham",2000));
		 customer.add(new customerInfo(432,"Riya",400));
		 customer.add(new customerInfo(234,"Priya",8000));
		 
		 for(customerInfo i:customer) {
			 System.out.println("Ac no.: "+i.acno+"\nCustomer Name: "+i.cname+"\nTotal Amount: "+i.amt);
		 }
		 
	}
}
class customerInfo{
	int acno,amt;
	String cname;
	public customerInfo(int acno, String cname, int amt) {
		super();
		this.acno = acno;
		this.amt = amt;
		this.cname = cname;
		
	}
	
}
/*
output:
Ac no.: 123
Customer Name: Soham
Total Amount: 2000
Ac no.: 432
Customer Name: Riya
Total Amount: 400
Ac no.: 234
Customer Name: Priya
Total Amount: 8000
*/
