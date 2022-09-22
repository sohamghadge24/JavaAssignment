package lab1;

//Write program to show method overriding using a Bank class as super class and 
//create some sub class accordingly. Write at least two common method and change the 
//implementation in subclass. Display the implementation of each subclass with object."


import java.util.Scanner;
public class Bank {
	static int balance =1000;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ab=0;
		System.out.print("Which operation do you want to parform \n1.Withdraw \n2.Deposit \nEnter number :");
			int a=sc.nextInt();
		Operation(a);
		
	}
	
	static void Operation(int a) {
		switch(a){
	    case 1:
	    	Deposit s1 =new Deposit(balance);
	    	s1.deposit();
	       break; 
	    case 2:
	    	Withdraw s2=new Withdraw(balance);
	    	s2.withdraw();
	        break;
	     default:
	    	 System.out.println("Please enter correct number(1 or 2)");
		}
	}
}
