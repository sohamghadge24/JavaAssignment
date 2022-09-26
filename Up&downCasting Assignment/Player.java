package Assignment;

public class Player {
	String stadium,jersey;
	
	int fees;
	Player(String stadium,String jersey,int fees ){
		this.stadium=stadium;
		this.fees=fees;
		this.jersey=jersey;
		System.out.println("Parent Constructor");
		stadium();fees();jersey();
	}
	void stadium() {
		System.out.println("Stadium :"+stadium);
	}
	void fees() {
		System.out.println("Fees :"+fees);
		}
	void jersey() {
		System.out.println("Jersey :"+jersey);
	}
	
	
	void match() {
		System.out.println("Match");
	}
}
