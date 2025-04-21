package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        float result = return_float_PI_Value();
        System.out.println(result);

    }
    static void f1(){
        System.out.println("No return");
    }
    static int return_int(){
        return 10;
    }
    static boolean return_boolean(){
        return true;
    }
    static float return_float_PI_Value(){
        return 3.14f;
    }
    static byte return_byte(){
        return 100;
    }
    static long return_long(){
        return 10l;
    }
    static String return_string(){
        return "JAVA";
    }
}
