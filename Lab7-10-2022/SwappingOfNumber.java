package Assignment2;

public class SwappingOfNumber {
	public static void main(String[] args) {
		SwappingOfNumber obj =new SwappingOfNumber();
		obj.ForDouble(200);
		obj.ForInt(100);
	}
	
	void ForInt(int a){
		System.out.println("integers: "+a);
		double b=a;
		System.out.println("Swapping with Double :"+b+"\n");
	}
	
	void ForDouble(double a){
		System.out.println("Double: "+a);
		int b=(int) a;
		System.out.println("Swapping with integers:"+b +"\n");
		}
}

/*
output:
	Double: 200.0
	Swapping with integers:200

	integers: 100
	Swapping with Double :100.0

*/
