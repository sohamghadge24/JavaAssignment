package labPractical;

class AboutPage extends WebPage{//child
	@Override
	void display() {
		System.out.println("AboutPage");
	}
	void about() {
		System.out.println("product related detail and feedback\n");
	}
}
