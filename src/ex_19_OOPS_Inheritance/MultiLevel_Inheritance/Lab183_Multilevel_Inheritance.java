package ex_19_OOPS_Inheritance.MultiLevel_Inheritance;

public class Lab183_Multilevel_Inheritance {
    public static void main(String[] args) {

       // Associate_Engineer AE = new Chief_Executive();
        //Associate_Engineer AE1 = new Manager();
        Associate_Engineer AE2 = new Associate_Engineer();

        Chief_Executive CE = new Associate_Engineer();// Dynamic Dispatch
        Chief_Executive CE1 = new Manager();
        CE1.CE();
        Manager M = new Associate_Engineer();
        Associate_Engineer AE = new Associate_Engineer();
    }
}
