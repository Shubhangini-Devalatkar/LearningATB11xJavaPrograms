package ex_19_OOPS_Inheritance.Hierarchical_Inheritance;

public class Lab185_Hierarchical {
    public static void main(String[] args) {
        Project_Manager P1 = new Project_Manager();
        Employee2 E1 = new Employee2();
        Employee1 E2 = new Employee1();

        P1.office();
        E1.office();
        E2.office();
    }

}

class Project_Manager{
    void office(){
        System.out.println("Project_Manager office");
    }
}

class Employee1 extends Project_Manager {
    void office(){
        System.out.println("Employee1 office");
    }
}

class Employee2 extends Project_Manager{
    void office(){
        System.out.println("Employee2 office");
    }
}