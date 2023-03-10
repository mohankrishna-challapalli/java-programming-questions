package Basics;


public class Main {
    int x=5;

    //Creating a static method
    static void myStaticmethod(){
        System.out.println("This is the example for static method ");
    }
    public void myPublicmethod(){
        System.out.println("This is the example for public method");
    }



    public static void main(String[] args) {
        //Adding Objects of another classes here is the main method
        Loops loop1=new Loops();
        System.out.println(loop1);
        //Creating more objects for a single class
        Main obj1=new Main();
        Main obj2=new Main();
        System.out.println("This is the first object value "+obj1.x);
        System.out.println("This is the second object value "+obj2.x);
        //Creating a object and modifying it's attributes
        Main obj3=new Main();
        obj3.x=15;
        System.out.println("Printing the modified value "+obj3.x);
        //Calling the static method
        myStaticmethod();
        //calling the public method
        Main obj4=new Main();//Creating an object for Main class
        obj4.myPublicmethod();

    }
}
