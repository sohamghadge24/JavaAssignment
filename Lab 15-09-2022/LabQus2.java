import java.util.Scanner;

//Print all the prime numbers within a given range by user.

public class LabQus2 {
    LabQus2(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int a=sc.nextInt();
        System.out.print("Enter Ending number: ");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            primeNumber(i);
        }
    }
    void primeNumber(int a){
        int c=0;
        for (int i=2;i<=a-1;i++) {
            if((a % i) == 0) {
               c=c+1;
            }
        }
           if(c == 0)
             System.out.println(a+" is a prime number");
    }
           
    
    public static void main(String[] args) {
        LabQus2 x=new LabQus2(); 
    }
}


/*
 *  output :
 0 Soham 0 Manager
349 null 100000 null
0 Aayush 0 Developer
100 null 250000 null
1002 soham 500000 Developer
 */
