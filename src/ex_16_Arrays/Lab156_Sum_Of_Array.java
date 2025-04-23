package ex_16_Arrays;

public class Lab156_Sum_Of_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 13, 14};
        int sum = 0;
        int sum1 =0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);


        System.out.println("---For Each---");// Advanced Loop
        for (int n : numbers) {
            sum1 = sum + n;
        }
        System.out.println(sum1);
    }
}
