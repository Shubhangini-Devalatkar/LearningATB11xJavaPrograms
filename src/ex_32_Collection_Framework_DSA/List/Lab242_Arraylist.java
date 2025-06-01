package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab242_Arraylist {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Java");
        arrayList.add(123);
        arrayList.add("Java");
        arrayList.add(null);
        arrayList.add("JAVA123");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList();
        l.add(123);
        l.add("Program");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
