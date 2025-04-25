package ex_20_OOPS_Polymorphism.MethodOverriding;

public class Lab190_Method_Overriding_Automation {
    public static void main(String[] args) {
        ChromeTC C1 = new ChromeTC();
        C1.OpenBrowser();

        FirefoxTC F1 = new FirefoxTC();
        F1.OpenBrowser();

        CommonToAll CA1 = new CommonToAll();
        CA1.OpenBrowser();

        //Dynamic dispatch
        CommonToAll CA2 = new ChromeTC();
        CA2.OpenBrowser();

        CommonToAll CA3 = new FirefoxTC();
        CA3.OpenBrowser();
    }
}

class CommonToAll{
    void OpenBrowser(){
        System.out.println("Open the IE Browser");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void OpenBrowser() {
        System.out.println("Open the Chrome Browser");
    }
}

class FirefoxTC extends CommonToAll{
    @Override
    void OpenBrowser() {
        System.out.println("Open the Firefox Browser");
    }
}