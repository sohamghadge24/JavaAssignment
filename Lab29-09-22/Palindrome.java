package labPractical;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String rev="";
		System.out.print("Enter a number :");
		String a =sc.next();
		for(int i=(a.length()-1);i>=0;i--) {
			rev +=a.charAt(i);
		}
		if(rev.equalsIgnoreCase(a)) {
			System.out.println(a+" is a Palindrome String. ");
		}
		else
		{
			System.out.println(a+" is not a Palindrome String. ");
		}
	}
}
/*
Output:
      Enter a number :12321
      12321 is a Palindrome String.
      */
