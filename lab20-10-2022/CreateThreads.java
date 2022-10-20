package collection;
//Create threading with getName,setName() methods.


public class CreateThreads extends Thread{
	public static void main(String[] args) {
		CreateThreads n1=new CreateThreads();
		CreateThreads n2=new CreateThreads();
		CreateThreads n3=new CreateThreads();
		
		System.out.println("before setting name");
		System.out.println("Thread - 1: " + n1.getName());  
		System.out.println("Thread - 2: " + n2.getName());  
		System.out.println("Thread - 3: " + n3.getName());  
		
		n1.setName("First Thread");
		n2.setName("Second Thread");
		n3.setName("Third Thread");
		System.out.println();
		System.out.println("After setting name");
		System.out.println("Thread - 1: " + n1.getName());  
		System.out.println("Thread - 2: " + n2.getName());  
		System.out.println("Thread - 3: " + n3.getName());  
		
		System.out.println();
		n1.start();
		n2.start();
		n3.start();
	}
	public void run(){
		System.out.println("Thread  " + Thread.currentThread().getName()+" running...");
	}
}
/*
output:
before setting name
Thread - 1: Thread-0
Thread - 2: Thread-1
Thread - 3: Thread-2

After setting name
Thread - 1: First Thread
Thread - 2: Second Thread
Thread - 3: Third Thread

Thread  First Thread running...
Thread  Second Thread running...
Thread  Third Thread running...
*/
