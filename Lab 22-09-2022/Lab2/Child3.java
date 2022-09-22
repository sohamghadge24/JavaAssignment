package lab2;
//child3
class Child3 extends Parent{
	int a=super.familyMember+3;
	Child3(){
		super();
		super.display(a);
		System.out.println("Child3");
	}
}
