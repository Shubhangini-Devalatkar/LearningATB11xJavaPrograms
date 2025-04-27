package ex_24_OOPS_Abstraction;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.loan50k();
        E1.loan25k();
    }
}


abstract class Manager{
    abstract void loan50k();

    void loan25k(){
        System.out.println("Pay 25k");
    }
}

class Employee extends Manager{
    @Override
    void loan50k() {
        System.out.println("Employee will clear the loan of 50K");
    }
}