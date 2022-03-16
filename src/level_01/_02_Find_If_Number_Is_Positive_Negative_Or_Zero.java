package level_01;

public class _02_Find_If_Number_Is_Positive_Negative_Or_Zero {
    /*
    METHOD-1 -> isPositive
    Write a method that takes an int argument and returns true if it is positive
    and returns false if it is negative or zero

    TEST DATA:
    5

    EXPECTED OUTPUT:
    true
     */

    public static boolean isPositive(int a){
        return a > 0;
    }


    /*
    METHOD-2 -> isNegative
    Write a method that takes an int argument and returns true if it is negative
    and returns false if it is positive or zero

    TEST DATA:
    -1

    EXPECTED OUTPUT:
    true
     */

    public static boolean isNegative(int a){
        return a < 0;
    }


    /*
    METHOD-3 -> isZero
    Write a method that takes an int argument and returns true if it is zero (neutral)
    and returns false if it is positive or negative

    TEST DATA:
    0

    EXPECTED OUTPUT:
    true
     */

    public static boolean isZero(int a){
        return a == 0;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println("\n---------Testing isPositive method---------\n");
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-5)); // false

        System.out.println("\n---------Testing isNegative method---------\n");
        System.out.println(isNegative(-1)); // true
        System.out.println(isNegative(0)); // false
        System.out.println(isNegative(1)); // false

        System.out.println("\n---------Testing isZero method---------\n");
        System.out.println(isZero(0)); //
        System.out.println(isZero(3)); // false
        System.out.println(isZero(-3)); // false
    }
}
