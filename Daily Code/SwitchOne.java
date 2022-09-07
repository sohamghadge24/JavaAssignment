import java.util.Scanner;

class SwitchOne{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" 1. addition of two number " );
        System.out.println(" 2. multiplication of 3 number");
        System.out.println(" 3.Substruction of two number ");
        int a = SwitchOne.num();
        switch(a){
            case 1:
            int num1 = num();
            int num2 = num();
            SwitchOne.add(+num1,num2);
               break; 
            case 2:
            int numA = num();
            int numB = num();
            int numC = num();
            SwitchOne.mul(numA,numB,numC);
                break;
            case 3:
            int x = num();
            int y = num();
            SwitchOne.sub(x,y);
                break;
            default: System.out.print("Pls Enter Valid input");

        }
    }
    static int num(){
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        return x;
    }
    static void add(int a,int b){
        System.out.print("Addition of "+a+"+"+b+" = "+(a+b));
    }
    static void  mul(int a,int b,int c){
        System.out.print("Multiplation of "+a+"*"+b+"*"+c+"="+(a*b*c));
        
    }
    static void sub(int a,int b){
        System.out.print("Substration of "+a+"-"+b+"="+(a-b));
    }
}