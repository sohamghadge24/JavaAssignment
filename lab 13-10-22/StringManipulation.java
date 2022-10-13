package Oop_Employe;
/*
 *  a)==   b)equals()   c)concat()   d)replace()   e)split()   f)charAt    g)compareTo()    h)substring()

 */
public class StringManipulation {
	public static void main(String[] args) {
		String a="Soham";
		String b=new String("Soham");
		//a)==
		System.out.println("");
		if(a==b)
			System.out.println("a==b");
		else
			System.out.println("a==b is not equal");
		
		//b)equals() 
		if(a.equals(b))
			System.out.println("a is not equal b");
		else
			System.out.println("a is not equal b");
		
		//c)concat()
		System.out.println(a.concat(b));
		
		//d)replace()
		System.out.println(a.replace("Aayush", "So"));
		
		// e)split()
		System.out.println(a.split(b));
		
		//f)charAt
		System.out.println(a.charAt(2));
		
		//g)compareTo() 
		System.out.println(a.compareTo(b));
		
		//h)substring()
		System.out.println(b.substring(4));
		
	}
}
