package ex_25_OOPS_Interface;

public class Lab202_Abstraction {
}


class ConcreteClass implements Incomplete_Interface{

    @Override
    public void display() {
        System.out.println("Hi");
    }
}

interface Incomplete_Interface{
    int a = 10;
    void display();

    default void display2(){
        System.out.println("Default is allowed!");
    }

    static void display3(){
        System.out.println("Default is allowed!");
    }
}

abstract class Incomplete_abstract{
    int a= 10;
    abstract void display1();
    void display2(){

    }
}
