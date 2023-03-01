package Basics;

import java.util.Scanner;

public class Functions {
    public static int  addNumbers(int a ,int b ){
        int sum=a+b;
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int sum=addNumbers(a,b);
        System.out.println("Sume of two number: "+sum);

    }
}
