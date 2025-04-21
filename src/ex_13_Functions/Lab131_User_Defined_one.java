package ex_13_Functions;

public class Lab131_User_Defined_one {
    public static void main(String[] args) {
    int r1  = sum_of_two_numbers(3,10);
        int r2  = sum_of_two_numbers(23, 30);

        System.out.println(r1);
        System.out.println(r2);

    }
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
}
