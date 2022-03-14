package level_01;

public class _02_Find_Smallest_Number {
    /*
    METHOD-1 -> findSmallestOf2Numbers1
    Write a method that takes 2 int arguments and returns the smallest number
    NOTE: 2 numbers being same is okay

    TEST DATA:
    1, 7

    EXPECTED OUTPUT:
    1
     */

    // Use Math.min() method to find min value of 2 int variables as below
    public static int findSmallestOf2Numbers1(int a, int b){
        return Math.min(a, b);
    }


     /*
    METHOD-2 -> findSmallestOf2Numbers2
    Write a method that takes 2 int arguments and returns the smallest number
    NOTE: 2 numbers being same is okay

    TEST DATA:
    1, 7

    EXPECTED OUTPUT:
    1
     */

    // Use if else statements to find min value of 2 int variables as below
    public static int findSmallestOf2Numbers2(int a, int b){
        if(a <= b) return a;
        return b;
    }


    /*
    METHOD-3 -> findSmallestOf3Numbers1
    Write a method that takes 3 int arguments and returns the smallest number
    NOTE: 2 or 3 numbers being same is okay

    TEST DATA:
    1, 1, 7

    EXPECTED OUTPUT:
    1
     */

    // Use Math.min() method to find min value of 3 int variables as below
    public static int findSmallestOf3Numbers1(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }


    /*
    METHOD-4 -> findSmallestOf3Numbers2
    Write a method that takes 3 int arguments and returns the smallest number
    NOTE: 2 or 3 numbers being same is okay

    TEST DATA:
    1, 1, 7

    EXPECTED OUTPUT:
    1
     */

    // Use if else statements to find min value of 3 int variables as below
    public static int findSmallestOf3Numbers2(int a, int b, int c){
        if(a <= b && a <= c) return a;
        else if(b <= a && b <= c) return b;
        return c;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(findSmallestOf2Numbers1(1, 7)); // 1
        System.out.println(findSmallestOf2Numbers2(1, 7)); // 1
        System.out.println(findSmallestOf3Numbers1(1, 1, 7)); // 1
        System.out.println(findSmallestOf3Numbers2(1, 1, 7)); // 1
    }
}
