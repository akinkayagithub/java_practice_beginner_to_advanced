package level_03;

public class _01_Validate_A_String_AS_Email {
    /*
    Write a method that takes a String and returns true or falase
    If it is a valid email in the format of <2+chars>@<2+chars>.<2+chars>

    TEST DATA:
    johndoe@gmail.com

    EXPECTED OUTPUT:
    true
     */

    //Solution without regex
    public static boolean validateEmail(String str){
        if(str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length() < 8 ||
                str.indexOf("@") != str.lastIndexOf("@")) return false;

        String part1 = str.substring(0, str.indexOf("@"));
        String part2 = str.substring(str.indexOf("@")+1, str.indexOf("."));
        String part3 = str.substring(str.indexOf(".")+1);

        return part1.length() >= 2 && part2.length() >= 2 && part3.length() >= 2;
    }

    //Testing method
    public static void main(String[] args) {
        System.out.println(validateEmail("")); //false
        System.out.println(validateEmail("jogndoe")); //false
        System.out.println(validateEmail("jogndoe@gmail")); //false
        System.out.println(validateEmail("jogndoe@gmail.")); //false
        System.out.println(validateEmail("jogndoe@gmail.c")); //false
        System.out.println(validateEmail("jogndoe@g.com")); //false
        System.out.println(validateEmail("j@gndoe.com")); //false
        System.out.println(validateEmail("@gmail.com")); //false
        System.out.println(validateEmail("abd@gmail.com")); //true


    }
}
