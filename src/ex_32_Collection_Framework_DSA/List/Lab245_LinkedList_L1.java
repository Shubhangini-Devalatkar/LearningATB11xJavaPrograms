package ex_32_Collection_Framework_DSA.List;

import java.util.LinkedList;

public class Lab245_LinkedList_L1 {
    public static void main(String[] args) {
        LinkedList<String> Countries = new LinkedList();

        Countries.add("Nepal");
        Countries.add("North America");
        Countries.addFirst("India");
        Countries.addLast("South America");
        System.out.println("LinkedList: " + Countries);

        System.out.println("First element: " + Countries.getFirst());
        System.out.println("Last element: " + Countries.getLast());

        Countries.removeFirst();
        Countries.removeLast();
        System.out.println("LinkedList after removal; " + Countries);
        System.out.println("Size of the LinkedList:" + Countries.size());

    }

}
