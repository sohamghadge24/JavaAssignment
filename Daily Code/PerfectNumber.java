import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count=0;
        int totalcount=0;
        PerfectNumber obj =new PerfectNumber();
        System.out.print("Enter lower limit: ");
        int a = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int b = sc.nextInt(); 
        for(int i=a;i<=b;i++){
            if(a!=0&&i!=1)
                count=obj.num(i,count);   //method call 
        }
         System.out.print("Perfect Number count : "+count); //total count 
       
    }
    int num(int a,int count){   //
        int sum=1;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a){
            count+=1;
        }
        return count;
    
    }
}
