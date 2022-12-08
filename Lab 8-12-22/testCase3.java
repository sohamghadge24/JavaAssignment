//question. 3

//testcase_3 class (java)
import java.util.*;

public class testcase_3 {
	List<String> student =new ArrayList<String>();
	
	public int size() {
		return student.size();
	}
	
	public void addName(String name) {
		student.add(name);
	}
	public void remove() {
		student.clear();
	}
	
}


//testcase3 (junit )
import static org.junit.Assert.*;

import org.junit.Test;

public class testcase3 {
	testcase_3 obj=new testcase_3();
	@Test
	public void addname() 
	{
		obj.addName("Soham");
		obj.addName("Jay");
		obj.addName("Vijay");
		int a=obj.size();
		assertEquals(3,a);
		 
	}
	
	@Test 
	public void remove() {
		obj.remove();
	}
	

}
