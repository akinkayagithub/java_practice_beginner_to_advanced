package level_02;

public class _04_Counting_Characters_In_An_Char_Array {
    /*
    METHOD-1 countLetters
    Write a method that takes a char array argument and returns the total occurrences of letter elements in the array as an int

    TEST DATA:
    ['a', '2', ' ', 'r', '#', 'B', '8']

    EXPECTED OUTPUT:
    3
     */

    public static int countLetters(char[] arr) {
        int count = 0;
        for (char element : arr) {
            if(Character.isLetter(element)) count++;
        }
        return count;
    }


    /*
    METHOD-2 countDigits
    Write a method that takes a char array argument and returns the total occurrences of digit elements in the array as an int

    TEST DATA:
    ['a', '2', ' ', 'r', '#', 'B', '8']

    EXPECTED OUTPUT:
    2
     */

    public static int countDigits(char[] arr) {
        int count = 0;
        for (char element : arr) {
            if(Character.isDigit(element)) count++;
        }
        return count;
    }


    /*
    METHOD-3 countSpaces
    Write a method that takes a char array argument and returns the total occurrences of space elements in the array as an int

    TEST DATA:
    ['a', '2', ' ', 'r', '#', 'B', '8']

    EXPECTED OUTPUT:
    2
     */

    public static int countSpaces(char[] arr) {
        int count = 0;
        for (char element : arr) {
            if(Character.isWhitespace(element)) count++;
        }
        return count;
    }


    /*
    METHOD-4 countUpperCaseLetters
    Write a method that takes a char array argument and returns the total occurrences of uppercase letter elements in the array as an int

    TEST DATA:
    ['a', '2', ' ', 'r', '#', 'B', '8']

    EXPECTED OUTPUT:
    1
     */

    public static int countUpperCaseLetters(char[] arr) {
        int count = 0;
        for (char element : arr) {
            if(Character.isUpperCase(element)) count++;
        }
        return count;
    }


    /*
    METHOD-5 countLowerCaseLetters
    Write a method that takes a char array argument and returns the total occurrences of lowercase letter elements in the array as an int

    TEST DATA:
    ['a', '2', ' ', 'r', '#', 'B', '8']

    EXPECTED OUTPUT:
    2
     */

    public static int countLowerCaseLetters(char[] arr) {
        int count = 0;
        for (char element : arr) {
            if(Character.isLowerCase(element)) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println("\n---------Testing countLetters method---------\n");
        System.out.println(countLetters(new char[]{})); // 0
        System.out.println(countLetters(new char[]{' ', '$', '1'})); // 0
        System.out.println(countLetters(new char[]{'a', '2', ' ', 'r', '#', 'B', '8'})); // 3

        System.out.println("\n---------Testing countDigits method---------\n");
        System.out.println(countDigits(new char[]{})); // 0
        System.out.println(countDigits(new char[]{' ', 'a', '$'})); // 0
        System.out.println(countDigits(new char[]{'a', '2', ' ', 'r', '#', 'B', '8'})); // 2

        System.out.println("\n---------Testing countSpaces method---------\n");
        System.out.println(countSpaces(new char[]{})); // 0
        System.out.println(countSpaces(new char[]{'a', '$', '1'})); // 0
        System.out.println(countSpaces(new char[]{'a', '2', ' ', 'r', '#', 'B', '8'})); // 1

        System.out.println("\n---------Testing countUpperCaseLetters method---------\n");
        System.out.println(countUpperCaseLetters(new char[]{})); // 0
        System.out.println(countUpperCaseLetters(new char[]{'a', ' ', '$', '1'})); // 0
        System.out.println(countUpperCaseLetters(new char[]{'a', '2', ' ', 'r', '#', 'B', '8'})); // 1

        System.out.println("\n---------Testing countLowerCaseLetters method---------\n");
        System.out.println(countLowerCaseLetters(new char[]{})); // 0
        System.out.println(countLowerCaseLetters(new char[]{'A', ' ', '$', '1'})); // 0
        System.out.println(countLowerCaseLetters(new char[]{'a', '2', ' ', 'r', '#', 'B', '8'})); // 2
    }
}
