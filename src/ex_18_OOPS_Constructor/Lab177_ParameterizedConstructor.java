package ex_18_OOPS_Constructor;

public class Lab177_ParameterizedConstructor {
    public static void main(String[] args) {

        CAR2 C1 = new CAR2();
        CAR2 C2 = new CAR2();
        System.out.println(C1.Name);
        System.out.println(C2.Name);

        CAR2 C3 = new CAR2("Baleno", 2015, "TATA");
        System.out.println(C3.Model);

        CAR2 C4 = new CAR2("Nexon", 2022, "TATA");
        System.out.println(C4.Year);

    }
}
//Default Constructor
class CAR2{
    String Name;
    int Year;
    String Model;

    CAR2(){
        Name = "Unknown";
        Year = 1990;
        Model = "XXX";
        System.out.println("Default Constructor");

    }
    //Parameterized Constructor
    CAR2(String Name, int Year, String Model){
        this.Name = Name;
        this.Year = Year;
        this.Model = Model;

    }

}



