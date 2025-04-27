package ex_25_OOPS_Interface;

public class Lab199_Interface_Example {
    public static void main(String[] args) {
        CAR1 C1 = new CAR1();
        C1.drive();
    }
}


class CAR1 implements Engine, Brakes{

    void drive(){
        StartEngine();
        StopEngine();
        applybrakes();
    }

    @Override
    public void applybrakes() {
        System.out.println("Apply Brakes");
    }

    @Override
    public void StartEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stop the Engine");

    }
}


interface Brakes{
    void applybrakes();
}

interface Engine{
    void StartEngine();
    void StopEngine();
    default void test(){
        System.out.println("Concrete Complete");
    }
}
