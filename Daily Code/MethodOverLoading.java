import java.util.Scanner;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading n=new MethodOverLoading();
        Scanner sc =new Scanner(System.in); 
        System.out.print("How many data you have to print(1-3): ");
        int a=sc.nextInt();
        switch (a) {
            case 1:
                System.out.print("Enter Pin code: ");
                int b=sc.nextInt();
                n.data(b);
                break;
                case 2:
                System.out.print("Enter Pin code: ");
                int c=sc.nextInt();
                System.out.print("Enter Post office number: ");
                int d=sc.nextInt();
                n.data(c, d);
                break;
                case 3:
                System.out.print("Enter Pin code: ");
                int e=sc.nextInt();
                System.out.print("Enter Post office number: ");
                int f=sc.nextInt();
                System.out.print("Enter City-Name: ");
                String g=sc.next();
                n.data(e ,f,g);
                break;
        
            default:
            System.out.print("Please enter between  1 to 3");
                break;
        }
    }
    void data(int a){
        System.out.print("Pin code: "+a);
    }
    void data(int a,int  b){
        System.out.print("Pin code: "+a+" "+"\nPost Office"+b);
    }
    void data(int a,int b,String c){
        System.out.print("Pin code: "+a+" "+"\nPost Office:"+b+" "+"\nCity:");
    }
}
