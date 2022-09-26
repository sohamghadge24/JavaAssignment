package Assignment;

public class Cricketer extends Player {
	String stadium,jersey;
	int fees;
	Cricketer(String stadium, String jersey, int fees) {
		this.stadium=stadium;
		this.fees=fees;
		this.jersey=jersey;
		super.stadium(stadium);
		super.jersey(jersey);
		super.fees(fees);
		// TODO Auto-generated constructor stub
	}
	Cricketer(){}
	void matchCricket() {
		System.out.println("Cricketer");
		batBall();
	}
	void batBall() {
		System.out.println("20-20 match ");
	}

}
