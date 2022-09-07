//wirte a code for greate number using user input

import java.util.Scanner;

public class GreaterNum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number a:");
        int a =sc.nextInt();
        System.out.print("Enter Number b:");
        int b =sc.nextInt();
        if (a<b)
            System.out.println(b+" is greater");
        else
            System.out.println(a+" is greater");
    }
}