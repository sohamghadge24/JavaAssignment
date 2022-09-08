
import java.util.Scanner;
// Write a java program to check a a is prime or not ? ( Using method is recommended )
public class CheckNumber {
       public static void main(String[] args) {
        int b=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        
      for (int i=2;i<=x-1;i++) {
         if((x % i) == 0) {
            b=+1;
         }
     }
        if(b == 0)
          System.out.println(x+" is a prime number");
        else 
         System.out.println(x+" is not a prime number");
      }
}

/*
Output :Enter Number :3
         3 is a prime number 
         Enter Number :21
         21 is a not prime number 

 */