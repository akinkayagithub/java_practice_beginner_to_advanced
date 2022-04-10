package level_03;

public class _01_Validate_A_String_As_Email {
public static boolean validateEmail(String str){
    if(str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length()<8 ||
            str.indexOf("@") !=str.lastIndexOf("@"))return false;
    return str.substring(0, str.indexOf("@")).length() >= 2 &&
            str.substring(str.indexOf("@")+1, str.indexOf(".")).length() >= 2 &&
            str.substring(str.lastIndexOf(".")+1).length() >= 2;
}

    public static void main(String[] args) {
        System.out.println(validateEmail(""));
        System.out.println(validateEmail("johndoe"));
        System.out.println(validateEmail("johndoe@gmail.com."));
        System.out.println(validateEmail("johhdoe@gmail.")); // false
        System.out.println(validateEmail("johhdoe@gmail.c")); // false
        System.out.println(validateEmail("johhdoe@g.com")); // false
        System.out.println(validateEmail("j@gmail.com")); // false
        System.out.println(validateEmail("@gmail.com")); // false
        System.out.println(validateEmail("a@b.c")); // false
        System.out.println(validateEmail("abc@gmail.com")); // true
    }
    }

