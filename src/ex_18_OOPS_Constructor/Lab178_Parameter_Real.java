package ex_18_OOPS_Constructor;

public class Lab178_Parameter_Real {
    public static void main(String[] args) {
        Person P1 = new Person("Arjun", 908765432, "Pune");
        Person P2 = new Person("Vihaan", 908865431, "Godrej");
        Person p4 = new Person("LUCKY",823424242);
        System.out.println(p4.address);



        P1.Study();
        P2.Study();




    }
}

class Person{
    String Name;
    long phone;
    String address;

    Person(){
        //Default constructor
    }

    Person(String Name, long phone, String address){
        this.Name = Name;
        this.phone = phone;
        this.address = address;
}

    Person(String Name,long phone){
        this.Name = Name;
        this.phone = phone;

    }
    void Study(){
        System.out.println(this.Name + " is Studying!");
    }
}