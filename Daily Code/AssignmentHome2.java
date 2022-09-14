import java.util.Scanner;
public class AssignmentHome2 {
    public static void main(String[] args) {
        AssignmentHome2 n=new AssignmentHome2();        
    }

    int count=0;
    int a,b;
    AssignmentHome2(){
        Scanner sc =new Scanner(System.in); 
        System.out.print("Enter lower limit: ");
        int in1 = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int in2 = sc.nextInt();
        a=in1;
        b=in2;
        PerfectNumber obj =new PerfectNumber();
        for(int i=lowerLimit(a,b);i<=upperLimit(a,b);i++){
            count=obj.num(i,count);   //method call 
        }
        System.out.print("Perfect Number count : "+count); 
    }
    int upperLimit(int a,int b){
        if(a>b)
            return a;//greater 
        return b;
    }
    int lowerLimit(int a,int b){
        if(a>b)
            return b; //
        return a;
    }
    int num(int a,int count){   //
        
        int sum=0;
        for (int i = 1; i < a; i++) {
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
