package level_01;

public class _01_Find_Greatest_Number {
    /*
    METHOD-1 -> findGreatestOf2Numbers1
    Write a method that takes 2 int arguments and returns the greatest number
    NOTE: 2 numbers being same is okay
    TEST DATA:
    3, 5
    EXPECTED OUTPUT:
    5
     */

    // Use Math.max() method to find max value of 2 int variables as below
    public static int findGreatestOf2Numbers1(int a, int b){
        return Math.max(a, b);
    }


     /*
    METHOD-2 -> findGreatestOf2Numbers2
    Write a method that takes 2 int arguments and returns the greatest number
    NOTE: 2 numbers being same is okay
    TEST DATA:
    3, 5
    EXPECTED OUTPUT:
    5
     */

    // Use if else statements to find max value of 2 int variables as below
    public static int findGreatestOf2Numbers2(int a, int b){
        if(a >= b) return a;
        return b;
    }


    /*
    METHOD-3 -> findGreatestOf3Numbers1
    Write a method that takes 3 int arguments and returns the greatest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    3, 3, 5
    EXPECTED OUTPUT:
    5
     */

    // Use Math.max() method to find max value of 3 int variables as below
    public static int findGreatestOf3Numbers1(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }


    /*
    METHOD-4 -> findGreatestOf3Numbers2
    Write a method that takes 3 int arguments and returns the greatest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    3, 3, 5
    EXPECTED OUTPUT:
    5
     */

    // Use Math.max() method to find max value of 3 int variables as below
    public static int findGreatestOf3Numbers2(int a, int b, int c){
        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        return c;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(findGreatestOf2Numbers1(3, 5)); // 5
        System.out.println(findGreatestOf2Numbers2(3, 5)); // 5
        System.out.println(findGreatestOf3Numbers1(3, 3, 5)); // 5
        System.out.println(findGreatestOf3Numbers2(3, 3, 5)); // 5
    }
}
