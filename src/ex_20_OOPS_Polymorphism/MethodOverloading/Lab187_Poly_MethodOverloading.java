package ex_20_OOPS_Polymorphism.MethodOverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations M1 = new MathOperations();
        int R1 = M1.add(3,9);
        int R2 = M1.add(4,5,10);
        double R3 = M1.add(3.29, 6.78);

        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R3);
    }
}

class MathOperations{
    // In the same class, When you have a method wit same
    // name but different arguments and different return type.

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
}
