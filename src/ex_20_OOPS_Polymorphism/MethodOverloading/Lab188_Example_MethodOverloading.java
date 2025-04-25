package ex_20_OOPS_Polymorphism.MethodOverloading;

public class Lab188_Example_MethodOverloading {
    public static void main(String[] args) {
        Home H1 = new Home();
        H1.task(3);
        H1.task(3, 6, 6);

    }
}

    class Home {

        void task(int a) {
            System.out.println("a");
        }

        void task(int a, int b) {
            System.out.println("a+b");
        }

        void task(int a, int b, int c) {
            System.out.println("a+b+c");
        }
    }

