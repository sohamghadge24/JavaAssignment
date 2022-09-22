package lab1;

import java.util.Scanner;

class Deposit{
	int balance;
	Scanner sc =new Scanner(System.in);
	Deposit(int balance){
		this.balance=balance;
		}
	
	//method to calculate 
	void deposit(){
		System.out.print("Please enter amount: ");
		int deposit=sc.nextInt();;
		int amount2 =creditMoney(balance,deposit);
		System.out.println("credit Amount : "+deposit);
			balance =amount2;
		System.out.println("Balance Amount : "+balance);
	}
	
	
	//method to display ammount 
	int creditMoney(int a,int b) { ////  balance,withdraw
		 System.out.println(b+" Withdraw Successfully");
		 return (a+b);
		}
	
}
