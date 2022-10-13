package Oop_Employe;

// a)equals()   b)reverse()    c)append()   d)delete()   f)insert()

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StringBuffer");
		StringBuffer a=new StringBuffer("Soham");
		StringBuffer b=new StringBuffer("Aayush");
		
		//a)equals()
		System.out.println(a.equals(b));
		
		//b)reverse()
		System.out.println(a+": "+a.reverse());
		
		//c)append()
		System.out.println(a+": "+a.append(123));
		
		//d)delete()
		System.out.println(a+": "+a.delete(2, 3));
		
		// f)insert()
		System.out.println(a+": "+a.insert(2,"hoS"));
		
		System.out.println();
		System.out.println("StringBuilder ");
		StringBuilder ac=new StringBuilder("Soham");
		StringBuilder bd=new StringBuilder("Aayush");
		
		//a)equals()
		System.out.println(ac.equals(bd));
		
		//b)reverse()
		System.out.println(ac+": "+ac.reverse());
		
		//c)append()
		System.out.println(ac+": "+ac.append(123));
		
		//d)delete()
		System.out.println(ac+": "+ac.delete(2, 3));
		
		// f)insert()
		System.out.println(ac+": "+ac.insert(2,"hoS"));
	}

}

/*
output:
  StringBuffer
  false
  Soham: mahoS
  mahoS: mahoS123
  mahoS123: maoS123
  maoS123: mahoSoS123

  StringBuilder 
  false
  Soham: mahoS
  mahoS: mahoS123
  mahoS123: maoS123
  maoS123: mahoSoS123

*/
