package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Microsoft";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        // System.out.println(name.charAt(14)); //java.lang.StringIndexOutOfBoundsException

        //concat
        System.out.println(name.concat(" services"));

        //contains
        System.out.println(name.contains("soft"));

        //equals
        System.out.println(name.equals("Microsoft"));

        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase(" services"));

        //indexOf()
        System.out.println(name.indexOf('i'));

        String S1 = "noun";
        System.out.println(S1.indexOf('n'));

        //length()
        System.out.println(name.length());

        //replace( ,)
        System.out.println(name.replace('s', 'S'));

        //Split()
        String s2 = "Shubhangini@Devalatkar@pune";
        String[] split = s2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //substring( ,)
        System.out.println(name.substring(2,6));

        // toLowerCase()
        System.out.println("MICROSOFT".toLowerCase());

        // toUpperCase()
        System.out.println("microsoft".toUpperCase());

        // startsWith()
        System.out.println(name.startsWith("M"));

        //  endsWith()
        System.out.println(name.endsWith("t"));

        //trim
        String str3 = "     Java        ";
        System.out.println(str3.trim());

        //CompareTo
        System.out.println(name.compareTo("Microsoft"));

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        String s11 = "Sequence";
        String s21 = s11.concat("FIZBUZZ");
        System.out.println(s21);



//        Concatenation (By +)

        String q1 = "Siemens";
        String q2 = " Technologies";
        String result = q1 + q2;
        System.out.println(result);

        // indexOf
        String w = "Nature";
        System.out.println(w.indexOf("u"));
        System.out.println(w.lastIndexOf("e"));
        System.out.println(w.lastIndexOf("o"));
    }
}
