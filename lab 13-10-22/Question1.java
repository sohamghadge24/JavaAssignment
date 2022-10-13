package Oop_Employe;

public class Question1 {
	public static void main(String[] args) {
		int a=10,b=0;
		System.out.println("Program Start");
		try {
			System.out.println(a/5);
			//System.out.println(a/b);
			//nexted 1
			try {
				String a1 = null;
				System.out.println("try nexted 1");
				if (a1.equals("Soham"))
	                System.out.print("Same");
	            else
	                System.out.print("Not Same");
				
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
			//nexted 2
			try {
				System.out.println("try nexted 2");
				String s="Soham";
				System.out.println(s.charAt(10));
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program end");
	}
}
