package ex_16_Arrays;

public class Lab151_Arrays_P2 {
    public static void main(String[] args) {
        String[] applications = {"Google", "Firefox", "Edge"};
        System.out.println(applications.length);
        System.out.println(applications[0]);
        System.out.println(applications[1]);
        System.out.println(applications[2]);


        String[] triangles = new String[4];
        triangles[0] = "Right angle triangle";
        triangles[1] = "Acute angle triangle";
        triangles[2] = "Equilateral triangle";
        triangles[3] = "Isoceles triangle";
        System.out.println(triangles[2]);
        System.out.println(triangles[0]);

        boolean[] Is_it_sunny_day = new boolean[2];
        Is_it_sunny_day[0] = true;
        Is_it_sunny_day[1] = false;
        System.out.println(Is_it_sunny_day[0]);
    }
}
