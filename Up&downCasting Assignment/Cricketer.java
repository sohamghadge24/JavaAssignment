package Assignment;

public class Cricketer extends Player {

	Cricketer(String stadium, String jersey, int fees) {
		super(stadium, jersey, fees);
		// TODO Auto-generated constructor stub
		
	}
	@Override 
	void match() {
		System.out.println("Cricketer");
		batBall();
	}
	void batBall() {
		System.out.println("20-20 match ");
	}

}
