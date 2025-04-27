package ex_23_OOPS_Super;

public class Lab194_Super_Example {
    public static void main(String[] args) {

        Peacock P1 = new Peacock();
        P1.display();

    }
}

class Birds{
    protected String color = "Blue";

    void Chirping(){
        System.out.println("whistling");
    }
}

class Peacock extends Birds{
    private String color = "Parrot green";

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.Chirping();
    }
}