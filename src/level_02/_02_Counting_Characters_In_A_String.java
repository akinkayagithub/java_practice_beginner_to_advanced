package level_02;

public class _02_Counting_Characters_In_A_String {
    /*
    METHOD-1 countSpaces
    Write a method that takes a String argument and returns the total occurrences of spaces in the String as an int

    TEST DATA:
    "123 Java, JavaScript, C# 456"

    EXPECTED OUTPUT:
    4
     */

    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) count++;
        }
        return count;
    }


    /*
    METHOD-2 countLetters
    Write a method that takes a String argument and returns the total occurrences of letters in the String as an int

    TEST DATA:
    "123 Java, JavaScript, C# 456"

    EXPECTED OUTPUT:
    15
     */

    public static int countLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) count++;
        }
        return count;
    }


    /*
    METHOD-3 countDigits
    Write a method that takes a String argument and returns the total occurrences of digits in the String as an int

    TEST DATA:
    "123 Java, JavaScript, C# 456"

    EXPECTED OUTPUT:
    6
     */

    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) count++;
        }
        return count;
    }


    /*
    METHOD-4 countUpperCases
    Write a method that takes a String argument and returns the total occurrences of upper cases in the String as an int

    TEST DATA:
    "123 Java, JavaScript, C# 456"

    EXPECTED OUTPUT:
    4
     */

    public static int countUpperCases(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) count++;
        }
        return count;
    }


    /*
    METHOD-5 countLowerCases
    Write a method that takes a String argument and returns the total occurrences of lower cases in the String as an int

    TEST DATA:
    "123 Java, JavaScript, C# 456"

    EXPECTED OUTPUT:
    11
     */

    public static int countLowerCases(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) count++;
        }
        return count;
    }


    /*
    METHOD-6 countSpecials
    Write a method that takes a String argument and returns the total occurrences of special characters in the String as an int

    TEST DATA:
    "123 Java, JavaScript, C# 456"

    EXPECTED OUTPUT:
    3
     */

    public static int countSpecials(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) count++;
        }
        return count;
    }




    //Testing method
    public static void main(String[] args) {
        System.out.println("\n---------Testing countSpaces method---------\n");
        System.out.println(countSpaces("")); // 0
        System.out.println(countSpaces("Hello")); // 0
        System.out.println(countSpaces("123 Java, JavaScript, C# 456")); // 4

        System.out.println("\n---------Testing countLetters method---------\n");
        System.out.println(countLetters("")); // 0
        System.out.println(countLetters("123")); // 0
        System.out.println(countLetters("123 Java, JavaScript, C# 456")); // 15

        System.out.println("\n---------Testing countDigits method---------\n");
        System.out.println(countDigits("")); // 0
        System.out.println(countDigits("Hello")); // 0
        System.out.println(countDigits("123 Java, JavaScript, C# 456")); // 6

        System.out.println("\n---------Testing countUpperCases method---------\n");
        System.out.println(countUpperCases("")); // 0
        System.out.println(countUpperCases("hello")); // 0
        System.out.println(countUpperCases("123 Java, JavaScript, C# 456")); // 4

        System.out.println("\n---------Testing countLowerCases method---------\n");
        System.out.println(countLowerCases("")); // 0
        System.out.println(countLowerCases("HELLO")); // 0
        System.out.println(countLowerCases("123 Java, JavaScript, C# 456")); // 11

        System.out.println("\n---------Testing countSpecials method---------\n");
        System.out.println(countSpecials("")); // 0
        System.out.println(countSpecials("Hello")); // 0
        System.out.println(countSpecials("123 Java, JavaScript, C# 456")); // 3
    }
}
