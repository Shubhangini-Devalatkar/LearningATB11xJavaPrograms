package ex_09_Switch;

public class Lab093_JDKAbove13 {
    public static void main(String[] args) {
        int a = 0013;
        switch (a){
            case 0013 -> System.out.println("001");
            case 0014 -> System.out.println("002");
            case 0015 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
