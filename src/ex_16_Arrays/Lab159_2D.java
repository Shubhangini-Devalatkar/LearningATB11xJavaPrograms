package ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        // no of rows = 3 and no of columns = 3

        // 1,2,3
        // 4,5,6
        // 7,8,9
        int[][] array_2d_old = { {1,2,3},{4,5,6},{7,8,9}};

        int[][] predefined = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array;
        array = new int[][] { {10, 20}, {30, 40}, {50, 60} };
        // 10,20
        // 30,40
        // 50,60


        int [][] arrays_2d = new int[3][3];
        arrays_2d[0][0] = 1;
        arrays_2d[0][1] = 2;
        arrays_2d[0][2] = 3;

        arrays_2d[1][0] = 4;
        arrays_2d[1][1] = 5;
        arrays_2d[1][2] = 6;


        arrays_2d[2][0] = 7;
        arrays_2d[2][1] = 8;
        arrays_2d[2][2] = 9;

        System.out.println(arrays_2d[0][3]);

    }
}
