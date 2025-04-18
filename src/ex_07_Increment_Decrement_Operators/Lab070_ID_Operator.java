package ex_07_Increment_Decrement_Operators;

public class Lab070_ID_Operator {
    public static void main(String[] args) {
        // pre increment -value is incremented first and then stored in the result.
        // value is increased by 1

        int a = 10;
        int b = ++a; // b= 10+1 = 11
        System.out.println(b);//11
        System.out.println(a);// 11
    }
}
