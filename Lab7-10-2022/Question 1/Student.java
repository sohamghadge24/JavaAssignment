class Student extends Person{
	@Override
	void person(int pid, String pname) {
		System.out.println("Student Id: "+pid+"\nStudent Name: "+pname);
		marks();
	}
	void marks() {
		System.out.println("Student total Marks :"+super.marks+"\n");
	}
