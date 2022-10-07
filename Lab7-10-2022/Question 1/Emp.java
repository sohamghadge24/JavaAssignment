class Emp extends Person{

	@Override
	void person(int pid, String pname) {
		System.out.println("Employee Id: "+pid+"\nEmployee Name: "+pname);
		salary();
	}
	void salary() {
		System.out.println("Employee Salary:"+ super.salary+"\n");
	}
}
