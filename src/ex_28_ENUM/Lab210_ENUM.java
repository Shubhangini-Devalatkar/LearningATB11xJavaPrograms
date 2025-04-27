package ex_28_ENUM;

import java.sql.SQLOutput;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        A a = new A();
        System.out.println(a.days[5]);
    }
}
class A{
    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum PROJECT_URLs{
    google, restassured, katalon, vwo
}