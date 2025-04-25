package ex_20_OOPS_Polymorphism.MethodOverloading;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator C1 = new Calculator();
        int R1 = C1.add(3, 10);
        double R2 = C1.add(3.89, 6.89);
        System.out.println(R1);
    }

}
