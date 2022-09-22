package lab2;

//parent class
class Parent{
	int  familyMember;
	Parent(){
		 familyMember=2;
		 display(familyMember);
		 System.out.println("Parent");
	}	
	void display(int familyMember) {
		System.out.println("Family-member :"+familyMember);
		
	}
	
}
