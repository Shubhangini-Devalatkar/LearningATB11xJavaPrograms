package ex_06_Ternary_Operator;

public class Lab064_Interview_QA {
    public static void main(String[] args) {
        int number = 25;
        String result = number > 10 ? (number > 20? "Num>20" : "Num<20") : "B ";
        System.out.println(result);
    }
}
