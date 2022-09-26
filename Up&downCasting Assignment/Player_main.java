package Assignment;

public class Player_main {
  //main 
	public static void main(String[] args) {
		//Player(String stadium,String jersey,int fees ){
		//for football
		Player ply1 =new Player("London Olympic Stadium","Emirates",400000);
		if(ply1 instanceof Footballer) 
			((Footballer)ply1).match();
		
		
		//for Cricketer
		Player ply2 =new Player("Wankhede Stadium","INDIAN",600000);
		if(ply2 instanceof Cricketer) 
			((Cricketer)ply2).match();
	}
}
