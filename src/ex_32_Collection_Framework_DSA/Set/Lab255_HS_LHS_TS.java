package ex_32_Collection_Framework_DSA.Set;

import java.sql.SQLOutput;
import java.util.*;

public class Lab255_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();

        hs.add("Apple");
        hs.add("Mango");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add("Jackfruit");
        System.out.println(hs);

        for(String s: hs){
            System.out.println(s);
        }

        System.out.println("-----------");

        Iterator iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------");

        Set lhs = new LinkedHashSet();
        lhs.add("Boysenberry");
        lhs.add("Apricot");
        lhs.add("Apricot");
        lhs.add("Gooseberry");
        lhs.add("Guava");
        lhs.add("Kiwi");
        lhs.add("Mangosteen");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Kiwi"));
        System.out.println(lhs.size());

        System.out.println("---------------");

        Set ts = new TreeSet();
        ts.add("Gooseberry");
        ts.add("Guava");
        ts.add("Kiwi");
        ts.add("Apricot");
       // ts.add(123); // java.lang.ClassCastException
       // ts.add(null); // java.lang.NullPointerException
        System.out.println(ts);


    }
}
