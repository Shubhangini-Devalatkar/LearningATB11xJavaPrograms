package ex_06_Ternary_Operator;

public class Lab065_TO_MaxNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 30;
        System.out.println(Math.max(x , y));

        int max = x > y ? x : y ;
        System.out.println(max);
    }
}
