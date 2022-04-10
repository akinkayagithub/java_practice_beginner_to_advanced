package level_03;

public class _01_Validate_A_String_As_Email {
    /*
    Write a method that takes a String and returns true or false
    If it is a valid email in the format of <2+chars>@<2+chars>.<2.chars>

    TEST DATA:
    johndoe@gmail.com

    expected output :
    true
     */

    //solution without regex
    public static boolean validateEmail(String str){
        if (str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length() < 8 ||
                str.indexOf("@") != str.lastIndexOf("@")) return false;


        String part1 = str.substring(0, str.indexOf("@"));
        String part2 = str.substring(str.indexOf("@") +1, str.indexOf("."));
        String part3 = str.substring(str.lastIndexOf(".") + 1);

        return part1.length() >= 2 && part2.length() >= 2 && part3.length() >= 2;

        // return str.substring(0, str.indexOf("@")).length() >= 2 &&
        //        str.substring(str.indexOf("@")+1, str.indexOf(".")).length() >= 2 &&
        //        str.substring(str.lastIndexOf(".")+1).length() >= 2;
    }


    // Testing Method

    public static void main(String[] args) {
        System.out.println(validateEmail(""));
        System.out.println(validateEmail("johndoe"));
        System.out.println(validateEmail("johndoe@gamil"));
        System.out.println(validateEmail("johndoe@gmail.c"));
        System.out.println(validateEmail("J@gmail.com"));
        System.out.println(validateEmail("johndoe@gmail.c"));
        System.out.println(validateEmail("@gmail.com"));
        System.out.println(validateEmail("abc@gmail.com"));

    }
}
