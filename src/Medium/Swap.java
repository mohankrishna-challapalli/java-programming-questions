package Medium;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to swap");
       int i= sc.nextInt();
       int j=sc.nextInt();
       int t;
       t=i;
       i=j;
       j=t;
        System.out.println(i);
        System.out.println(j);


    }
}
