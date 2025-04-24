package ex_19_OOPS_Inheritance.MultiLevel_Inheritance;

public class Lab184_Multilevel_Inheritance1 {
    public static void main(String[] args) {

        Associate_Engineer Arjun = new Associate_Engineer();
        Arjun.CE();
        Arjun.Manager();
        Arjun.Associate_Engineer();
        System.out.println(Arjun.salary);

        Chief_Executive CE = new Manager();
        CE.Office();
    }
}
