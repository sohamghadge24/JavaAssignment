package Assignment2;
import java.util.*;

//Implement a program with "hashSet and TreeSet "Class

public class HashTreeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTreeProgram obj=new HashTreeProgram();
		obj.HashSet();
		System.out.println();
		obj.TreeSet();
	}
	void HashSet(){
		HashSet<String> hash=new HashSet<String>();
		hash.add("Soham");
		hash.add("has");
		hash.add("good");
		hash.add("health");
		hash.add("and ");
		hash.add("wealth");
		
		System.out.println("HashSet : ");
		for(String s:hash) {
			System.out.println(s);
		}
	}
	void TreeSet(){
		TreeSet<String> tree =new TreeSet<String>();
		tree.add("null");
		
		tree.add("Soham");
		tree.add("Good");
		tree.add("boy");
		tree.add("pretty girl");
		tree.add("number");
		System.out.println("TreeSet : ");
		for(String s:tree) {
			System.out.println(s);
		}
	}

}


/*
output:
        HashSet : 
        wealth
        and 
        health
        has
        Soham
        good

        TreeSet : 
        Good
        Soham
        boy
        null
        number
        pretty girl

*/

