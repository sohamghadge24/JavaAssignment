//A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:how many apples ??
import java.util.Scanner;

class FruitSeller {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("sell of apple in % :"); 
        int a =sc.nextInt();
        System.out.print("Enter number of apple still left :"); 
        int b =sc.nextInt(); 
        int d =100-a;
        double c =100*b/d;
        double totalNumber=0.6*b;
        System.out.print("Total Number of Apple is :"+c);
    }
}
