package ex_06_Ternary_Operator;

public class Lab067_TO_Max_Of_Three_Nums {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        int c = -11;
        int max = (a > b) ? (a > c) ? a : c : ((b > c) ? b : c);
        System.out.println(max);

    }
}
