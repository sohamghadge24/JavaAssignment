//Question 2

//maths class
public class Maths {
	int square(int a) 
	{
		return a*a;
	}
	int cube(int a) 
	{
		return a*a*a;
	}
}


//test_maths class(junit class)
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class test_maths {
	@BeforeClass
	public static  void beforeClass() {
		System.out.println("beforeClass");
	}
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@Test
	public void test1() {
		Maths n=new Maths();
		int a=n.cube(2);
		assertEquals(8,a);
		
	}
	@Test
	public void test2() {
		Maths n=new Maths();
		int a=n.square(9);
		assertEquals(81,a);
		
	}
	
	@After
	public void After() {
		System.out.println("After");
	}
	@AfterClass
	public static void AfterClass() {
		System.out.println("AfterClass");
	}
	

}

/*
output: 
        beforeClass
        before
        After
        before
        After
        AfterClass
*/
