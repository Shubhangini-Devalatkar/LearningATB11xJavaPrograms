package ex_29_WrapperClass;

public class Lab215_Wrapper_Conversion_Example {
    public static void main(String[] args) {
        String num = "10";
        int a = 10;

// String -> Wrapper -> ParseX();Integer.parseInt(num); Double.parseDouble(num)
        Integer A1 = Integer.parseInt(num);
        Integer B1 = Integer.valueOf(num);

        //String to primitive
        int A2 = Integer.parseInt(num);

        // Wrapper to String (toString method)
        System.out.println(A1.toString());

        //Primitive to String
        int age = 10;
        Integer age_Wrapper = age;
        System.out.println(age_Wrapper.toString());

    }

}
