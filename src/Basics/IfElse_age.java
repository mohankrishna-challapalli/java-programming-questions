package Basics;

import java.util.Scanner;

public class IfElse_age{
    public static void main(String[] args) {
//        int x=10;
//        int y=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age=sc.nextByte();
        if(age>20){
            System.out.println("You're allowed view thia site");
        }
        else {
            System.out.println("You are now allowed to view this site");
        }
    }
}
