package ex_20_OOPS_Polymorphism.MethodOverriding;

public class Lab189_Method_Overriding {
    public static void main(String[] args) {
        Peacock P1 = new Peacock();
        P1.Chirping();
    }
}

class Birds{
    void Chirping(){
        System.out.println("Birds Chirping");
    }
}
class Peacock extends Birds{
    @Override
    void Chirping() {
        System.out.println("whistling sound");
    }
}