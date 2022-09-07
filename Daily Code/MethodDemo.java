import java.util.Scanner;

class MethodDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number A:");
        int a=sc.nextInt();
        //System.out.print("Enter Number B:");
        //int b=sc.nextInt();
        MethodDemo.CheckNum(a);

    }
    static void CheckNum(int n){
        if(0 < n)
            System.out.print(n+" is positive");
        else
            System.out.print(n+" is negative");
    }
}
