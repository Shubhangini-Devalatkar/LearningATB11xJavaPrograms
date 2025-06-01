package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab241_List {
    public static void main(String[] args) {
        List fruits = List.of("Apple", "Mango");
        System.out.println( fruits);
      //  fruits.add("CHIKU"); //java.lang.UnsupportedOperationException
        //fruits.remove("apple"); // Not possible

        List l = new ArrayList(); // Dynamic Diapatch
        ArrayList l2 = new ArrayList();
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Java");
        System.out.println(l);
    }
}
