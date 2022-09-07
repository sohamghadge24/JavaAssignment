import java.util.Scanner;

public class ResturantBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Starter-bill :");
        int s= sc.nextInt();
        System.out.print("main course-bill :");
        int mc =sc.nextInt();
        System.out.print("Desert-bill :");
        int d = sc.nextInt();
        System.out.println();
        totalBill(s,mc,d);
    }
    static void totalBill(int a,int b,int c){
        int total =a+b+c;
        double x= 0.04*(b+c);//
        System.out.println("Total :"+total);
        System.out.println("serivce charge 4% :"+x);
        double netTotal =total+x;
        System.out.println("Net Total :"+netTotal);
    }
    
}
