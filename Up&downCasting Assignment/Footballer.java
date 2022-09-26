package Assignment;

public class Footballer  extends Player{

	Footballer(String stadium, String jersey, int fees) {
		super(stadium, jersey, fees);
		// TODO Auto-generated constructor stub
		match();
	}
	@Override 
	void match() {
		System.out.println("Football");
		footBall();
	}
	void footBall() {
		System.out.println("45 min match ");
	}
}
