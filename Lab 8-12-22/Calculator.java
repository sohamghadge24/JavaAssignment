//Question 1


//Calculator.java     
public class Calculator {

	int add(int a,int b) {
		return a+b;
	}
	int multi(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}
	int sub(int a,int b) {
		return a-b;
	}

}


//testcase 
import static org.junit.Assert.*;

import org.junit.Test;

public class test_Calculater {

	@Test
	public void test() {
		Calculator c=new Calculator();
		int a=c.add(10, 20);
		assertEquals(30,a);
		a=c.div(20, 5);
		assertEquals(4,a);
		a=c.multi(2, 5);
		assertEquals(10,a);
		a=c.sub(10, 4);
		assertEquals(6,a);	
    System.out.println("Success");
	}

}


//output:  Success
