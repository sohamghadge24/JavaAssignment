package Assignment;

public class Footballer  extends Player{
	String stadium,jersey;
	int fees;
	Footballer(String stadium, String jersey, int fees) {
		this.stadium=stadium;
		this.fees=fees;
		this.jersey=jersey;
		super.stadium(stadium);
		super.jersey(jersey);
		super.fees(fees);
		// TODO Auto-generated constructor stub
	}
	Footballer(){}
	void matchFootball() {
		System.out.println("Football");
		footBall();
	}
	void footBall() {
		System.out.println("45 min match ");
	}
}
