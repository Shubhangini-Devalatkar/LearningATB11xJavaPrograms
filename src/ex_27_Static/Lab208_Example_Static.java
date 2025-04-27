package ex_27_Static;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Lab208_Example_Static {
    public static void main(String[] args) {
        System.out.println(ATB11x.MentorName);
        System.out.println(ATB11x.Course);

        ATB11x.doAssignments();
        ATB11x.joinZoomForClass();

        ATB11x A1 = new ATB11x();
        A1.setName("Arjun");
        A1.setPhoneNumber("9998765432");
        System.out.println(A1.getName());
        System.out.println(A1.getPhoneNumber());

        ATB11x B1 = new ATB11x();
        B1.setName("Vihaan");
        B1.setPhoneNumber("9998765430");
        System.out.println(B1.getName());
        System.out.println(B1.getPhoneNumber());
    }
}

class ATB11x{
    static {
        System.out.println("Load the Class ATB11x");
    }
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String Name;
    private String phoneNumber;
    static String Course;
    static String MentorName;

    static void doAssignments(){
       // System.out.println(phoneNumber);//Static method cant access the non static instance variable
        System.out.println("Do Assignment");
    }
    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void PerformAssignment(){
        System.out.println("Performed differently");
    }

}
