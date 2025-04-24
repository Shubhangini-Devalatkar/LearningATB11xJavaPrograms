package ex_18_OOPS_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {
        CAR c1 = new CAR();
        System.out.println(c1.Name);
        System.out.println(c1.Year);
        System.out.println(c1.Model);

        System.out.println("-------");

        CAR c2 = new CAR();
        System.out.println(c2.Name);
        System.out.println(c2.Year);
        System.out.println(c2.Model);
    }


}
class CAR{
    String Name;
    int Year;
    String Model;

    //Default Constructor
    CAR(){
        Name = "Baleno";
        Year = 2018;
        Model = "Nexa";
    }

}
