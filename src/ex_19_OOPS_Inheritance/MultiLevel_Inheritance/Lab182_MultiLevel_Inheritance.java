package ex_19_OOPS_Inheritance.MultiLevel_Inheritance;

public class Lab182_MultiLevel_Inheritance {
    public static void main(String[] args) {

        Associate_Engineer AE = new Associate_Engineer();
        AE.Manager();
        AE.CE();
        AE.Associate_Engineer();

        Chief_Executive CE = new Chief_Executive();
        CE.CE();
        //CE.Manager();

        Manager M = new Manager();
        M.CE();
        M.Manager();
        //M.Associate_Engineer();


    }
}
