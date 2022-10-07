
public class Main_Bank {
	public static void main(String[] args) { //main method 
		
		Bank obj=new Sbi();
		obj.interest(100000);
		
		obj=new Axis();
		obj.interest(500000);
		
		obj=new Icici();
		obj.interest(100);
	}
}


/*
output:
	Money:100000
	Interest:7
	Money(with interest):107000

	Money:500000
	Interest:9
	Money(with interest):545000

	Money:100
	Interest:8
	Money(with interest):108
*/
