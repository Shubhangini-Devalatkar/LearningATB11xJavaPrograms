package ex_29_WrapperClass;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {

        int a= 10;
        Integer b = a;  // This Boxing -> automatically JVM will store the value
        // primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue()); // Behaviour
        System.out.println(Integer.MIN_VALUE); // Behaviour

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);


    }
}
