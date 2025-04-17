package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char C1 = 'A';// A TO Z, a to z, !@#$%^&*()_+
        char C2 = 'b';
        char C3 = '@';
        char C4 = '_';
        char C5 = '9';
        char C6 = '1';
        char C7 = '(';
        char C8 = ' ';// blank space is also a character


        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Java"+new_line+"Program");
        System.out.println("Java"+tab_line+"Program");
        System.out.println("Java"+back_space+"Program");
        System.out.println("Java"+carriage_return+"Program");


    }
}
