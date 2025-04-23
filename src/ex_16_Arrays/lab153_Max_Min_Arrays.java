package ex_16_Arrays;

public class lab153_Max_Min_Arrays {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max_output = Find_Max(array);
        System.out.println(max_output);
        int min_output = Find_Min(array);
        System.out.println(min_output);
    }

    private static int Find_Min(int[] array) {
        int min = array[0];
        for (int i=0; i > array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    private static int Find_Max(int[] array) {

        int max = array[0];
        for (int i=0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
