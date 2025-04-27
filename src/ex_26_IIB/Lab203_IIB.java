package ex_26_IIB;

public class Lab203_IIB {
    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```

    public static void main(String[] args) {
        A a = new A();

    }
}

class A{
    A(){
        System.out.println("Default Constructor");
    }
    {
        System.out.println("Instance Initialization Block");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection\n" +
        // read a csv, xlsx file\n" +
        // read json, xml.\n" +
        // read a text file or env file");
    }
    {
        System.out.println("Instance 2");
    }

    {
        System.out.println("Instance 3");
    }

}