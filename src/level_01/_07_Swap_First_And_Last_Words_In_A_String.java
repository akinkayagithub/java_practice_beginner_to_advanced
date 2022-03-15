package level_01;

public class _07_Swap_First_And_Last_Words_In_A_String {
    /*
    Write a method that takes a String argument and returns the String back with first and last word swapped
    NOTE: Assume that the given String will always have at least 2 words

    TEST DATA:
    "Java is fun"

    EXPECTED OUTPUT:
    fun is Java
     */

    public static String swapFirstAndLastWords(String str){
        String firstWord = str.substring(0, str.indexOf(' '));
        String lastWord = str.substring(str.lastIndexOf(" ") + 1);
        String middle = str.substring(str.indexOf(' ') + 1, str.lastIndexOf(' '));
        return lastWord + " " + middle + " " + firstWord;
    }

    /*
    Above block could be one line as below instead of creating separate variables
    return str.substring(str.lastIndexOf(" ") + 1)  + " " + str.substring(str.indexOf(' ') + 1, str.lastIndexOf(' ')) + " " + str.substring(0, str.indexOf(' '));
     */

    //Testing method
    public static void main(String[] args) {
        System.out.println(swapFirstAndLastWords("Java is fun")); // fun is Java
        System.out.println(swapFirstAndLastWords("I like Java")); // Java like I
    }
}
