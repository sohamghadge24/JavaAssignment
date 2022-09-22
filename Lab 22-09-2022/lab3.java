package lab3;

/*
 * 
The population of a town increased from 175000 to 262500 in a decade. 
Calculate the average percent increase of population per year.*/
public class Lab3 {
	public static void main(String[] args) {
		float FirstYearProp=175000;
		float FinalYearProp=262500;
		float sub=FinalYearProp-FirstYearProp;
		float d=sub/FirstYearProp;
		float total=d*100;
		float totalper=total/10;
		System.out.println("the average percent increase of population per year : "+ totalper+" %");
	}
}
