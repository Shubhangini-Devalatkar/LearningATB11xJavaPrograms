package ex_21_OOPS_Encapsulation;

import java.sql.SQLOutput;

public class Lab189_Encapsulation_Demo {
    public static void main(String[] args) {
        VWOlogin V1 = new VWOlogin("Admin","Password123");
        System.out.println(V1.Password);
        V1.Password ="qwerty123";
        System.out.println(V1.Password);

        VWOLogin_Encapsulation VWOEn = new VWOLogin_Encapsulation("Admin", "Passowrd1234");
        //System.out.println(VWOEn.username);
       // System.out.println(VWOEn.password);


        VWOEn.setPassword("abhpi1234",false);
        System.out.println(VWOEn.getPassword());

    }
}

class VWOlogin{
    public String Username;
    public String Password;

    VWOlogin(String username, String password){
        this.Username = username;
        this.Password = password;

    }
}


class VWOLogin_Encapsulation{
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, Boolean isAdmin) {
        if(isAdmin) {
            this.Password = password;
        }else{
            System.out.println("Not allowed to change the password!");
        }

    }

    private String Username;
    private String Password;

    public VWOLogin_Encapsulation(String username, String password){
        this.Username = username;
        this.Password = password;
    }

}