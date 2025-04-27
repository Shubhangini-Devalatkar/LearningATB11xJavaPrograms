package ex_25_OOPS_Interface;

public class Lab200_Multiple_Interface {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.project();
    }
}

interface Manager{
    void project();
}

interface Assistant_Manager{
    void project();
}

class Employee implements Manager, Assistant_Manager{

    @Override
    public void project() {
        System.out.println("Employee Project");
    }
}
