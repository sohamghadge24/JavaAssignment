package lab2;
//child 1
class Child1 extends Parent{
	int a=super.familyMember+1;
	Child1(){
		super();
		display(a);
		System.out.println("Child1");
	}
	
}
