package Oop_Employe;

class MarkException  extends Exception  
{  
    public MarkException (String str)  
    {  
        
        super(str);  
    }  
}  


public class Wrp_main extends MarkException  {
	public static void main(String[] args) {
		try{
		       validate(50);
		       //validate(70);
		      
		  }
		 catch(MarkException e){
		    System.out.println(e) ;
		 }
	}
	
	int marks;
	public Question2(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	
	
	
	static void validate(int marks) throws MarkException{    
	       if(marks<=60){  
	  
	        // throw an object of user defined exception  
	        throw new MarkException("Unqualified");    
	    }  
	       else {   
	        System.out.println("Qualified");   
	        }   
	     }    
	
}
/*
output
  Oop_Employe.MarkException: Unqualified
*/
