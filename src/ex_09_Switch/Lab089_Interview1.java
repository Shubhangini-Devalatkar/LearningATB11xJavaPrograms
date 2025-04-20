package ex_09_Switch;

import java.sql.SQLOutput;

public class Lab089_Interview1 {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match the ch A");
                break;
            default:
                System.out.println("Mismatch");
                break;
        }
    }
}
