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
 * Enter starting number: 1
Enter Ending number: 100
1 is a prime number
2 is a prime number
3 is a prime number
5 is a prime number
7 is a prime number
11 is a prime number
13 is a prime number
17 is a prime number
19 is a prime number
23 is a prime number
29 is a prime number
31 is a prime number
37 is a prime number
41 is a prime number
43 is a prime number
47 is a prime number
53 is a prime number
59 is a prime number
61 is a prime number
67 is a prime number
71 is a prime number
73 is a prime number
79 is a prime number
83 is a prime number
89 is a prime number
97 is a prime number
 */
