package homeAssign;

import java.io.FileWriter;

public class FileWriterProg {
	 public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("/Users/soham/Documents/abc.txt");    
           fw.write("hello sir");    
           fw.close();    
           System.out.println("Success...");    
          }catch(Exception e)
         {
        	  System.out.println(e);
         }    
          
     }    
}
/*
output:Success...
*/
