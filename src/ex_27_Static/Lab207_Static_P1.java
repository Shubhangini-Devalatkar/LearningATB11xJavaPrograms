package ex_27_Static;

import java.sql.SQLOutput;

public class Lab207_Static_P1 {
    public static void main(String[] args) {
        B.CommonToAll();
        System.out.println(B.b);


        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);
    }
}

class B{
    static{
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 10;
    static int b = 10;

    void display(){
        System.out.println(b);
        System.out.println("Non Static function");
    }

    static void CommonToAll(){
        //System.out.println(a); // This is not possible, can use non static in static function
        System.out.println("Static Function");
    }
}

//static C{
    // Not Useful
//}