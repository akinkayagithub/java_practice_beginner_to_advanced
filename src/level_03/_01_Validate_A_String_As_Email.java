package level_03;

public class _01_Validate_A_String_As_Email {

    /* TASK-4 - validateEmailAddress() method
    Write a method that takes a “String email” as an argument and checks if the given email is valid or not
    This method will return true if given email is true, or false if given email is not valid
    A VALID EMAIL:
    -should NOT have any space
	-should not have more than one “@” character
	-should be in the given format <2+chars>@<2+chars>.<2+chars>
    */
    public static boolean validateEmail(String str){
        if (str.contains(" ") || !str.contains("@") || !str.contains(".") ||
                (str.indexOf("@") != str.lastIndexOf("@")) || str.length() < 8) return false;

        return str.substring(0, str.indexOf("@")).length() >= 2 &&
                str.substring(str.indexOf("@") + 1, str.indexOf(".")).length() >= 2 &&
                str.substring(str.lastIndexOf("@")).length() >= 2;
    }
    // str.length()-1 != str.removeAll("@").length(); -- if the expression is equal this mean there's only 1 @ but if it's not
    // equals then this means there was more than one @ ex: str.length-1 != str.length-2 --> there were 2 @.

    //TESTING METHODS:
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
