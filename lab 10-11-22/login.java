package Booking;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		String s1,password;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Username");
		s1 = sc.nextLine();
		System.out.println("Enter your password");
		password = sc.nextLine();
		try {
			validPassword(password);
			System.out.println("Username: " + s1);
			System.out.println(password+" Valid Password");
		}catch (PasswordException e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}
		sc.close();
	}

	public static void validPassword(String password)throws PasswordException {
		// TODO Auto-generated method stub
		String[] SpecialChar = {"!","@","#","$","%","^","&","*","(",")","_","+","-"};
		//1
		if (!((password.length() >= 8) && (password.length() <= 15))) {
			throw new PasswordException(1);
		}
		
		//
		if (password.contains(" ")) {
        throw new PasswordException(2);
		}
		
		//3
		if (true) {
			int count = 0;

            //If the user enters any integer value so this loop will change it into String 
            for (int i = 0; i <= 9; i++) {
				String str1 = Integer.toString(i);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new PasswordException(3);
			}
		}
		
		
		//4
		
		if (true) {
			int count = 0;

			// To check capital letters
			for (int i = 65; i <= 90; i++) {
				char c = (char)i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new PasswordException(5);
			}
		}

		if (true) {
			int count = 0;
			// To check for  small letters
			for (int i = 90; i <= 122; i++) {
				char c = (char)i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new PasswordException(6);
			}
		}
		
		  // This will check all the problems relative to the password if any error comes Switch case 4 will handle it
        if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("+") || password.contains("/") 		|| password.contains(":") || password.contains(".") || password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?") || password.contains("|"))) {
			throw new PasswordException(4);
		}
//		if (true) {
//			int count = 0;
//
//			 
//            for (int i = 0; i <= SpecialChar.length+1 ; i++) {
//			
//				if (password.contains(SpecialChar[i])) {
//					count = 1;
//					System.out.println(count+"true");
//				}
//			}
//			if (count == 0) {
//				throw new PasswordException(3);
//			}
//		}
		
		
	}
	
}


class PasswordException extends Exception {
	int a=0;
	public PasswordException(int a) {
		super("Invalid Password: ");
		this.a = a;
	}
	
	public String printMessage()
	{
        // Using switch statement to allocate the errors when User enters the password
		switch (a) {

		case 1:
			return ("Password length should be between 8 to 15 characters");

		case 2:
			return ("Password should not contain any space");

		case 3:
			return ("Password should contain at least one digit(0-9)");

		case 4:
			return ("Password should contain at least one special character");

		case 5:
			return ("Password should contain at  least one uppercase letter(A-Z)");

		case 6:
			return ("Password should contain at least one lowercase letter(a-z)");
		}

		return ("");
	}
}


/*output

Enter your Username
Soham
Enter your password
Soham@394
Username: Soham
Soham@394 Valid Password
*/
