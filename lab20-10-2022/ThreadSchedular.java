package collection;

//)Create thread using ThreadSchedular methods sleep(),join()

public class ThreadSchedular extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread n1=new Thread(new ThreadSchedular());
	
		n1.start();

		for(int i=0;i<10;i++) {
			System.out.println(currentThread().getName()+" :"+i);
				try {
					n1.join(1000);
					
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
		System.out.println("Is Alive? " + n1.isAlive()); 
		
		
	}
	
	
	public void run(){
		Thread t = Thread.currentThread(); 
		System.out.println("Thread  " + t.getName()+" running...");
		 System.out.println("Is Alive? " + t.isAlive()); 
	}

}




/*
output:
      main :0
      Thread  Thread-1 running...
      Is Alive? true
      main :1
      main :2
      main :3
      main :4
      main :5
      main :6
      main :7
      main :8
      main :9
      Is Alive? false

