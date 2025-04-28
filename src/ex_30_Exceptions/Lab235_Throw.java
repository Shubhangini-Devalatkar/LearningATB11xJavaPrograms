package ex_30_Exceptions;

public class Lab235_Throw {
    public static void main(String[] args) {

    }
    static void dividebyZero(int a){
        if(a==0){
            throw new ArithmeticException();
        }
    }
}
