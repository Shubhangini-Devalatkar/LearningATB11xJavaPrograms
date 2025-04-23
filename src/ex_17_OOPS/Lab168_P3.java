package ex_17_OOPS;

public class Lab168_P3 {
    public static void main(String[] args) {
        cats C1 = new cats();
        cats C2;
        new cats();


        C1.running();
    }
}

class cats{
    String Name;
    void running(){
        System.out.println("Running");
    }
}
