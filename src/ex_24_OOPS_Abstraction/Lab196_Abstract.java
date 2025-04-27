package ex_24_OOPS_Abstraction;

public class Lab196_Abstract {
    public static void main(String[] args) {
        Nexon N1 = new Nexon();
        N1.drive();
    }
}

abstract class Cars{

    abstract void StartEngine();

    abstract void StopEngine();

    void RepairEngine(){
        System.out.println("Repair the Engine");
    }

}

class Nexon extends Cars{

    @Override
    void StartEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    void StopEngine() {
        System.out.println("Stop the ENgine");

    }

    void drive(){
        StartEngine();
        StopEngine();
        RepairEngine();
    }
}
