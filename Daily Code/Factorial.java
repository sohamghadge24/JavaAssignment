import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        fact(x);
    }
    static void fact(int a){
        int num=1;
        for(int i=1;i<=a;i++){    
            num=num*i;    
        }    
        //System.out.print(num);
        System.out.print("Factorial of "+a+" is : "+num);
    }
}
