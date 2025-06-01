package ex_31_Generics;

public class Lab238_Generics {
    public static void main(String[] args) {
        temp_sum(3,6);
        temp_sum(3.23,9.10);
        temp_sum("Nation","Wide  ");




    }
    static <G> G  temp_sum(G a, G b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
