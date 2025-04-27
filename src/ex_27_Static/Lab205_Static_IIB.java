package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();

    }
}

class P{
    {
        System.out.println("Instance initialization Block");
    }

    P(){
        System.out.println("Default Constructor");
    }
    static{
        System.out.println("Static Initialization Block");

    }
}
