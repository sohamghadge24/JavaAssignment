package labPractical;

//Quest3
public class AndroidPhone_main {
	public static void main(String[] args) {
		//String name,int ram,String color
		
		AndroidPhone[] arr =new AndroidPhone[3];
		arr[0]=new AndroidPhone("Apple", 8 ,"Space Gray");
		arr[1]=new AndroidPhone("MI", 6 ,"Black");
		arr[2]=new AndroidPhone("Samsung", 6 ,"white");
	}
}

/*
output: 
	Apple is having 8 Hardware
	Apple is having Space Gray Hardware

	MI is having 6 Hardware
	MI is having Black Hardware

	Samsung is having 6 Hardware
	Samsung is having white Hardware
	*/
