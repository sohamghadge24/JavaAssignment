package labPractical;

//Quest 3 part 3 
public  class AndroidPhone {
	String name,color;
	int ram;
	AndroidPhone(String name,int ram,String color){
		this.color=color;
		this.name=name;
		this.ram=ram;
		RAM();Color();
	}

	void RAM() {
		System.out.println(name+"is having "+ram+ " Hardware");
	}
	

	 void Color() {
		 System.out.println(name+"is having "+color + " Hardware\n");
	 }
	
}
