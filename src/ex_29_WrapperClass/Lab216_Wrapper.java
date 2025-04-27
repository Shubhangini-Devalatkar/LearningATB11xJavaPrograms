package ex_29_WrapperClass;

public class Lab216_Wrapper {
    public static void main(String[] args) {
        Mobile M1 = new Mobile("iPhone", 1,120000.00 );
        Mobile M2 = new Mobile("iPhone", 2,100000.00 );

        M1.display();
        M2.display();

        M1.setName("Samsung");
        System.out.println(M1.getName());

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();
    }
}

class Mobile extends OldPhone{
    private String Name;
    private Integer Phone;
    private Double Price;
    static String mobile_carrier = "airtel";

    Mobile(){
        System.out.println("Default Constructor");
    }

    public Mobile(String name, Integer phone, Double price) {
        Name = name;
        Phone = phone;
        Price = price;
    }

    void display(){
        System.out.println(this.Name+this.Phone+this.Price);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane Mode");
    }
    void priceChange(Integer price){
        System.out.println("Change price in Integers");
    }
    void priceChange(Double price){
        System.out.println("Change price in decimals");
    }


    @Override
    void calling() {
        System.out.println("Touch Dailpad");
    }
}

class OldPhone implements SIMCard{

    void calling(){
        System.out.println("Dailpad");
    }

    @Override
    public void enterCard() {
        System.out.println("Card entered");
    }
}
interface SIMCard{
    void enterCard();
}