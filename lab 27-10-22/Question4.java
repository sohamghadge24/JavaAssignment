package lab27;

import java.io.Console;

public class Question4 {
	public static void main(String[] args) {
		Console console= System.console();
		
    if (console == null) {
        System.out.println("No console available");
        return;
    }
    
    System.out.println("Enter the password: ");   
    char[] ch=console.readPassword();   

    String pass = String.valueOf(ch);   
    System.out.println("Password is: " + pass);   
	}
}

/*
output: 
Enter the password: 

Password is: 12345678
*/
