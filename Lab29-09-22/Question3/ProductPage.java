package labPractical;

class ProductPage extends WebPage{//child
	@Override
	void display() {
		System.out.println("ProductPage");
	}
	void product() {
		System.out.println("Product1");
		System.out.println("Product2");
		System.out.println("Product3");
		System.out.println("Product4\n");
	}
}
