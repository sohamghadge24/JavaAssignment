import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int sum=0;
            System.out.println("1.Number of your choose");
            System.out.println("2.Number in Sequence");
            System.out.println("3.Number digits");
            System.out.print("Enter Number : ");
            int x = sc.nextInt();
            switch(x){
                case 1:
                        System.out.print("how many number: ");
                        int a = sc.nextInt();
                        for(int i=0;i<a;i++){
                            System.out.print("Enter  Number: ");
                            int b = sc.nextInt(); 
                            sum+=b;
                        }
                        System.out.println("Sum of Numbers is "+sum);
                break;
                    
                    
                case 2:
                        System.out.print("Enter starting Number: ");
                        int s = sc.nextInt();
                        System.out.print("Enter ending  Number: ");
                        int y = sc.nextInt();
                        sum(s,y);
                        break;  
                   
                case 3:System.out.print("Enter  Number: ");
                        int z = sc.nextInt();
                        while(z!=0){
                            sum+=(z%10);
                            z=z/10;
                        }
                        System.out.println("Sum of Numbers is "+sum);
            }
    }
    
    static void sum(int a, int b) {
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("Sum of Numbers is "+sum);
    }
    
}
