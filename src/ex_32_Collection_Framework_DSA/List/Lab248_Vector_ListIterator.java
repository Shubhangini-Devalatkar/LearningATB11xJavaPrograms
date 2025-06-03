package ex_32_Collection_Framework_DSA.List;

import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("Java");
        vector.add("Java1");
        vector.add("Java2");
        vector.add("Java3");
        vector.add("Java4");

        ListIterator listIterator = vector.listIterator();

        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
