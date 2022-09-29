package labPractical;

class Contactpage extends WebPage{//child
	@Override
	void display() {
		System.out.println("Contactpage");
	}
	void contact(){
		System.out.println("Contact : 099-999-444");
		System.out.println("email : xyz@gmail.com\n");
	}
	
}
