package ex_30_Exceptions;

public class Lab224_Try_IQ {
    public static void main(String[] args) {
        try {
            String S1 = null;
            S1.trim();
            int s2 = 10 / 0;
        }catch (NullPointerException | ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
