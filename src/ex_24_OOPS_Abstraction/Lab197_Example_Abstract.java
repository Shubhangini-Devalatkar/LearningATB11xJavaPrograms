package ex_24_OOPS_Abstraction;

public class Lab197_Example_Abstract {
}

abstract class Employee1{

    private String name;
    private String address;
    private int number;

    Employee1(){
        System.out.println("DC");
    }

    Employee1(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }


}

class C1 extends Employee1{

    @Override
    double computePay() {
        return 0;
    }
}
