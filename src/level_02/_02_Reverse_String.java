package level_02;

public class _02_Reverse_String {
    /*
    Write a method that takes a String and returns reversed String

    TEST DATA:
    Hello

    EXPECTED OUTPUT:
    olleH
     */

    public static String reverseString(String str){
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(reverseString("Hello")); // olleH
        System.out.println(reverseString("World")); // dlroW
    }
}
