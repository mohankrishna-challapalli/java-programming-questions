package Basics;

import java.util.Scanner;

class calculator{
    public int addIntegers(int a,int b){
        int r= a+b;
        return r;
    }
}

public class classDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int num2=sc.nextInt();
        calculator cal=new calculator();
        int result=cal.addIntegers(num,num2);
        System.out.println(result);


    }
}
