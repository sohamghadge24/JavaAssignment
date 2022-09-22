package lab2;
//child2
class Child2 extends Parent{
	int a=super.familyMember+2;
	Child2(){
		super();
		display(a);
		System.out.println("Child2");
	}
	
}
