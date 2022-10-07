
public class Main_Bank {
	public static void main(String[] args) {
		Bank obj=new Sbi();
		obj.interest(100000);
		
		obj=new Axis();
		obj.interest(500000);
		
		obj=new Icici();
		obj.interest(100);
	}
}
