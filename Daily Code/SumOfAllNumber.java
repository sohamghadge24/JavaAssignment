import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            System.out.print("Enter starting Number: ");
            int a = sc.nextInt();
            System.out.print("Enter ending  Number: ");
            int b = sc.nextInt();
             sum(a,b);
           
    }
    static void sum(int a, int b) {
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("Sum of Numbers is "+sum);
    }
    
}
