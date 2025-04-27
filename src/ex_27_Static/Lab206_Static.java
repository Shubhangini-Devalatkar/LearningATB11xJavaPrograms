package ex_27_Static;

public class Lab206_Static {

    public static void main(String[] args) {
        A ref1 = new A(10);
        ref1.displayValue();
        System.out.println(A.b);
        A.b = 45;

        System.out.println("-----");

        A ref2 = new A(30);
        ref2.displayValue();
        System.out.println(A.b);

        A ref3 = new A(20);
        ref3.displayValue();
        System.out.println(A.b);

    }
}

class A {
    int a = 10;
    static int b = 20;

    A(int a){
            this.a = a;
    }

    void displayValue(){
        System.out.println(this.a);
    }
}
