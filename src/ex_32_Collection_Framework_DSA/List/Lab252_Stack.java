package ex_32_Collection_Framework_DSA.List;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Java");
        s.add("Program");
        System.out.println(s);


        s.push("Birds");
        s.push("Peacock");
        s.push("Hummingbird");
        s.push("Nightingale");
        s.push("Seabird");

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
    }
}
