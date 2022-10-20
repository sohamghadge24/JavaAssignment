package collection;

import java.util.*;

//"HashMap" and "LinkedHashMap",”TreeMap” collections with insertion,updation,deletion?
public class CollectionClass {
	public static void main(String[] args) {
		System.out.println("HashMap");
		HashMap<Integer,String> m = new HashMap<>();
		//CollectionList<String,Integer> n1=new CollectionList<>();
		m.put( 10,"Soham");
        m.put(30,"Rohan");
        m.put(20,"Jay");
        
        System.out.println(m);
        m.put(10,"Vijay");
        System.out.println("Updated value");
        System.out.println(m);
       
        System.out.println("delete value");
        m.remove(20);
        System.out.println(m);
        System.out.println();
        
        TreeMap<Integer, String> t= new TreeMap<>(); 
        t.put(1,"Soham");
        t.put(3,"Priya");
        t.put(2,"Riya");
        System.out.println(t);
        t.put(3,"Vijay");
        System.out.println("Updated value");
        System.out.println(t);
       
        System.out.println("delete value");
        t.remove(2);
        System.out.println(t);
        System.out.println();
        
        
        LinkedHashMap<Integer, String> h= new LinkedHashMap<>();
        h.put(1,"Riya");
        h.put(3,"Priya");
        h.put(2,"Soham");
        System.out.println(t);
        h.put(3,"Vijay");
        System.out.println("Updated value");
        System.out.println(h);
       
        System.out.println("delete value");
        h.remove(2);
        System.out.println(h);
        System.out.println();
	}
}
/*
output: 
HashMap
{20=Jay, 10=Soham, 30=Rohan}
Updated value
{20=Jay, 10=Vijay, 30=Rohan}
delete value
{10=Vijay, 30=Rohan}

{1=Soham, 2=Riya, 3=Priya}
Updated value
{1=Soham, 2=Riya, 3=Vijay}
delete value
{1=Soham, 3=Vijay}

{1=Soham, 3=Vijay}
Updated value
{1=Riya, 3=Vijay, 2=Soham}
delete value
{1=Riya, 3=Vijay}

*/
