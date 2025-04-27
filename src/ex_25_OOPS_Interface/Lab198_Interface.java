package ex_25_OOPS_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.getArea(10, 20);

        Square S1 = new Square();
        S1.getArea(2,9);
    }
}

interface Polygon{
    void getArea(int length, int breadth);
}

class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area od Square -> "+3.14*length*breadth);
    }
}

class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is + (length * breadth)");

    }
}
