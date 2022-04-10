package level_03;

public class _01_Validate_A_String_As_Email {
     /*
    Write a method that takes a String and returns true or false
    If it is a valid email in the format of <2+chars>@<2+chars>.<2+chars>

    TEST DATA:
    johndoe@gmail.com

    EXPECTED OUTPUT:
    true

    abc@gmail.com   3 3
     */

    //Solution without regex
    public static boolean validateEmail(String str){
        if(str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length() < 8 ||
                (str.indexOf("@") != str.lastIndexOf("@"))) return false;

        return str.substring(0, str.indexOf("@")).length() >= 2 &&
                str.substring(str.indexOf("@")+1, str.indexOf(".")).length() >= 2 &&
                str.substring(str.lastIndexOf(".")+1).length() >= 2;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(validateEmail("")); // false
        System.out.println(validateEmail("johndoe")); // false
        System.out.println(validateEmail("johhdoe@gmail")); // false
        System.out.println(validateEmail("johhdoe@gmail.")); // false
        System.out.println(validateEmail("johhdoe@gmail.c")); // false
        System.out.println(validateEmail("johhdoe@g.com")); // false
        System.out.println(validateEmail("j@gmail.com")); // false
        System.out.println(validateEmail("@gmail.com")); // false
        System.out.println(validateEmail("a@b.c")); // false
        System.out.println(validateEmail("abc@gmail.com")); // true
    }
}