package Assignment;

public class Player_main {
	public static void main(String[] args) {
		//Player(String stadium,String jersey,int fees ){
		//for football
		Player ply =new Player();
		System.out.println();
		//for Footballer
		ply =new Footballer("London Olympic Stadium","Emirates",400000);
		if(ply instanceof Footballer) 
			((Footballer)ply).matchFootball();
		System.out.println();
		
		//for Cricketer
		ply =new Cricketer("Wankhede Stadium","INDIAN",600000);
		if(ply instanceof Cricketer) 
			((Cricketer)ply).matchCricket();;
	}
}
