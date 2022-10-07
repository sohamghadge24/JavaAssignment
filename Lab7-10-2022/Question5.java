package Assignment2;



class Ceo{
	Ceo(String name){
		System.out.println("This is Ceo");
		System.out.println("New Project Name:"+name+"\n");
	}
}


class Hr extends Ceo{

	Hr(String name) {
		super(name);
		System.out.println("This is Hr");
		System.out.println("Discussion on "+name+" project with Ceo"+"\n");
	}
	
}

class ProjectManager extends Hr{

	ProjectManager(String name) {
		super(name);
		System.out.println("This is Project Manager");
		System.out.println(name+" project Distrubuted among the Developers"+"\n");
	}
	
}

class Developer extends ProjectManager{

	Developer(String name) {
		super(name);
		System.out.println("This is Developer");
		System.out.println(name+" project  develop by Developers"+"\n");
	}
	
}


public class Question5 {
	public static void main(String[] args) {
		new Developer("Blood Donation");
	}
}
	/*
	 * Ceo 
	 *  |
	 *  Hr
	 *  |
	 *  ProjectManager
	 *  |
	 *  Developer
	 */




/*
 * output
         This is Ceo
        New Project Name:Blood Donation

        This is Hr
        Discussion on Blood Donation project with Ceo

        This is Project Manager
        Blood Donation project Distrubuted among the Developers

        This is Developer
        Blood Donation project develop by Developers
 */
