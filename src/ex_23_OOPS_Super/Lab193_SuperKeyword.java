package ex_23_OOPS_Super;

import java.util.Vector;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        car C1 = new car();
        C1.display();

    }
}

class vehice{
    public int maxspeed = 180;

    vehice(){
        System.out.println("Default Constructor");
    }

    vehice(int a ){
        System.out.println("Parameterized Constructor");
    }
// Method Overloading - same method name with differed parameter

    void Message(){
        System.out.println("No return type and no arguments");
    }

    void Message(int a){
        System.out.println("Parameterzied constructor with arguments");
    }

    void display(){
        System.out.println("Parent Vehicle");
    }
}

class car extends vehice {
    private int maxspeed = 280;
    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }



    car(){
        super();
    }

    car(int a){
        super(5);
    }
    @Override
    void display() {

        System.out.println(this.maxspeed);
        // Parent
        System.out.println(super.maxspeed);
        super.Message();
        super.Message(10);
        super.display();
    }
    
    }
