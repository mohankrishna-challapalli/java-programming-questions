package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int a=3,b=4;
        System.out.println(a);
        System.out.println(b);
        int temp;
//        temp=a;
//        a=b;
//        b=temp;
        System.out.println("===================");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
