package level_03;

public class _01_Validate_A_String_As_Email {
     /*
      TASK-4 - validateEmailAddress() method
•	Write a method that takes a “String email” as an argument and checks if the
    given email is valid or not
•	This method will return true if given email is true, or false if given email
    is not valid
•	A VALID EMAIL:
	-should NOT have any space
	-should not have more than one “@” character
	-should be in the given format <2+chars>@<2+chars>.<2+chars>
     */
     //Solution without regex TASK 4_Akin's
     //str.length()-1 != str.removeAll("@").length()
     public static boolean validateEmail(String str){
         if(str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length() < 8 ||
                 (str.indexOf("@") != str.lastIndexOf("@"))) return false;

         return str.substring(0, str.indexOf("@")).length() >= 2 &&
                 str.substring(str.indexOf("@")+1, str.indexOf(".")).length() >= 2 &&
                 str.substring(str.lastIndexOf(".")+1).length() >= 2;
     }
}
