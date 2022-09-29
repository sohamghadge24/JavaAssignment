package labPractical;

public class Polymorphism_main {
	public static void main(String[] args) {
		WebPage w=new WebPage();
		w.display();
		w = new HomePage();
		if(w instanceof HomePage) {
			((HomePage)w).display();
			
		}
		
		w = new AboutPage();
		if(w instanceof AboutPage) {
			((AboutPage)w).display();
			((AboutPage)w).about();;
		}
		
		w = new  ProductPage();
		if(w instanceof ProductPage) {
			((ProductPage)w).display();
			((ProductPage)w).product();;
			
		}
		
		w = new Contactpage();
		if(w instanceof Contactpage) {
			((Contactpage)w).display();
			((Contactpage)w).contact();
			
		}	
			
	}
}
/*
output:
	WebPage

	HomePage
	AboutPage
	product related detail and feedback

	ProductPage
	Product1
	Product2
	Product3
	Product4

	Contactpage
	Contact : 099-999-444
	email : xyz@gmail.com
	*/
