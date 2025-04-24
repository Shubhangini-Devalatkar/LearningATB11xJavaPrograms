package ex_18_OOPS_Constructor;

public class Lab173_Constructor {
    public static void main(String[] args) {
        Book B1 = new Book();
        B1.Storage();
        new Book();
        Book B2; // only object is created
    }
}

class Book{
    String Name;

    void use(){
        System.out.println("A book can be read, referenced, or even used as a decorative object.");
    }

    void Storage(){
        System.out.println("Books can be stored in various ways, such as on shelves, in boxes, or in digital formats.");
    }

    Book(){
        System.out.println("Birds Of Books");
    }


}