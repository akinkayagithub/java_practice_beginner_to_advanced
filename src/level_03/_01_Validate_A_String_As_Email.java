package level_03;

public class _01_Validate_A_String_As_Email {
    /*
    Write a method that takes a string and returns true or false
    If it is a valid email in the format <2+chars>@<2+chars>.<2+chars>

    TEST DATA:
    johndoe@gmail.com

    EXPECTED OUTPUT:
    true
     */
    //Solution without regex
    public static boolean validateEmail(String str){
        if (str.contains(" ") || str.length() < 8 || !str.contains("@") || !str.contains(".") ||
                (str.indexOf('@') != str.lastIndexOf('@'))) return false;

        return str.substring(0, str.indexOf('@')).length() >= 2 && str.substring(str.indexOf('@') + 1, str.indexOf('.')).length() >= 2 &&
                str.substring(str.indexOf('.') + 1).length() >= 2;


    }
    //Testing method
    public static void main(String[] args) {
        System.out.println(validateEmail(""));//false
        System.out.println(validateEmail("johndoe"));//false
        System.out.println(validateEmail("johndoe@gmail"));//false
        System.out.println(validateEmail("johndoe@gmail."));//false
        System.out.println(validateEmail("johndoe@gmail.c"));//false
        System.out.println(validateEmail("johndoe@g.com"));//false
        System.out.println(validateEmail("abc@gmail.com"));//true

    }
}
