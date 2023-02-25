package Basics;

public class Operators {
    public static void main(String[] args) {
        //Operators
        //Unary Operators
        int x=10,y=20;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        System.out.println(y++);
        //Arithmetic Operators
        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(x*y);
        x+=10;
        System.out.println(x);
        x-=4;
        System.out.println(x);
    }
}
