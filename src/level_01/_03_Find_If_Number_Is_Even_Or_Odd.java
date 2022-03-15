package level_01;

public class _03_Find_If_Number_Is_Even_Or_Odd {
    /*
    METHOD-1 -> isEven
    Write a method that takes an int argument and returns true if it is an even number
    and returns false if it is an odd number

    TEST DATA:
    4

    EXPECTED OUTPUT:
    true
     */

    public static boolean isEven(int a){
        return a % 2 == 0;
    }


    /*
    METHOD-2 -> isOdd
    Write a method that takes an int argument and returns true if it is an odd number
    and returns false if it is an even number

    TEST DATA:
    3

    EXPECTED OUTPUT:
    true
     */

    public static boolean isOdd(int a){
        return a % 2 == 1;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(isEven(4)); // true
        System.out.println(isEven(3)); // false

        System.out.println(isOdd(3)); // true
        System.out.println(isOdd(4)); // false
    }
}
