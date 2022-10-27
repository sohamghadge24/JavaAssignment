package lab27;

import java.util.Scanner;

//To input int,String,double,boolean details using "Scanner" class?
public class Question3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any number :");
		int a=sc.nextInt();
		System.out.print("Enter any number (double):");
		double b=sc.nextDouble();
		System.out.print("Enter any value (true or false):");
		boolean c=sc.nextBoolean();
		System.out.print("Enter name:");
		String d=sc.next();
		System.out.println();
		
		System.out.println("Integer number :"+a);
		System.out.println("Double number :"+b);
		System.out.println("Boolean number :"+c);
		System.out.println("String number :"+d);
	}
	
}
/*
output:
Enter any number :2
Enter any number (double):2.2
Enter any value (true or false):true
Enter name:Soham

Integer number :2
Double number :2.2
Boolean number :true
String number :Soham
*/
