package lab;

import java.util.Scanner;
class Withdraw{
	Scanner sc =new Scanner(System.in);
	int balance;
	Withdraw(int balance){
		this.balance=balance;
	}
	
	//method to calculate 
	void withdraw() {
			System.out.print("Please enter amount: ");
			int withdraw =sc.nextInt();
			int amount1 =withdrawMoney(balance,withdraw);
			if(amount1==0) {
				balance-=withdraw;
				System.out.println("credit Amount : "+withdraw);
				}
			System.out.println("Balance Amount : "+balance);
		}
	
	//method to display amount 
	int withdrawMoney(int a,int b) { //  balance,withdraw
		if (a>b) {
			System.out.println(b+" Withdraw Successfully");
			return 0;}
		else {
			System.out.println(b+" Withdraw Fail");
			System.out.println("Please check a balance");
		}
		return 1;
	}
}
