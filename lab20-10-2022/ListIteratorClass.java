package collection;

import java.util.*;
//Student details print forward and backward using ListIterator methods?
public class ListIteratorClass {
	public static void main(String[] args) {
		// Declaring arraylist without any initial size
				ArrayList<Student> arrayli = new ArrayList<>();

				// Creating user defined objects
				Student emp1 = new Student(123, "Rama", 78);
				Student emp2 = new Student(124, "Lakshman",98);
				Student emp3 = new Student(125, "Soham",90);

				// Appending all the objects for arraylist
				arrayli.add(emp1);
				arrayli.add(emp2);
				arrayli.add(emp3);

				System.out.print("Elements before reversing: ");
				printElements(arrayli);

				// Collections.reverse method takes a list as a
				// parameter and reverse the list
				Collections.reverse(arrayli);
				System.out.print("\nElements after reversing: ");
				printElements(arrayli);
			 
	}
	public static void printElements(ArrayList<Student> alist)
	{
		for (int i = 0; i < alist.size(); i++) {
			System.out.print("\n Student-ID:" + alist.get(i).studentID +", Student-Name:" + alist.get(i).studentName + ", Total-Marks:" +alist.get(i).studentMarks);
		}
	}
	
}
class Student {
	int studentID;
	String studentName;
	int studentMarks;

	// Constructor for initializing the class variables
	public Student(int studentID, String studentName, int studentMarks)
	{
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
}


