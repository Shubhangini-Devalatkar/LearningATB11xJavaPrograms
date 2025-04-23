package ex_17_OOPS;

public class Lab166_OOPS {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.Name = "Arjun";
        System.out.println(P1.Name);

        new Person().Name = "Not Ref name";

    }
}
class Person {
    // Attribute | Properties |  Data Members | Instance variables
    String Name;
    double salary;
    int eyes;
    byte age;
    String Phone_Number;

    // Behaviour | Function | Method
    void work() {
        System.out.println(" I m working and learning simultaneously");
    }

    int remaining_amount_sal(int salary, int tax) {
        return salary - tax;
    }
}
