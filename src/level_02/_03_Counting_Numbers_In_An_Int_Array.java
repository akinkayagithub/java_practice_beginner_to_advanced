package level_02;

public class _03_Counting_Numbers_In_An_Int_Array {
    /*
    METHOD-1 countPositives
    Write a method that takes an int array argument and returns the total occurrences of positive elements in the array as an int

    TEST DATA:
    [7, -3, -7, 0, 2, 0, 7, 10, 2, 1]

    EXPECTED OUTPUT:
    6
     */

    public static int countPositives(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(element > 0) count++;
        }
        return count;
    }


    /*
    METHOD-2 countNegatives
    Write a method that takes an int array argument and returns the total occurrences of negative elements in the array as an int

    TEST DATA:
    [7, -3, -7, 0, 2, 0, 7, 10, 2, 1]

    EXPECTED OUTPUT:
    2
     */

    public static int countNegatives(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(element < 0) count++;
        }
        return count;
    }


    /*
    METHOD-3 countZeros
    Write a method that takes an int array argument and returns the total occurrences of elements that are equal to zero in the array as an int

    TEST DATA:
    [7, -3, -7, 0, 2, 0, 7, 10, 2, 1]

    EXPECTED OUTPUT:
    2
     */

    public static int countZeros(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(element == 0) count++;
        }
        return count;
    }


    /*
    METHOD-4 countEvens
    Write a method that takes an int array argument and returns the total occurrences of elements that are even in the array as an int

    TEST DATA:
    [7, -3, -7, 0, 2, 0, 7, 10, 2, 1]

    EXPECTED OUTPUT:
    5
     */

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(element % 2 == 0) count++;
        }
        return count;
    }


    /*
    METHOD-5 countOdds
    Write a method that takes an int array argument and returns the total occurrences of elements that are odd in the array as an int

    TEST DATA:
    [7, -3, -7, 0, 2, 0, 7, 10, 2, 1]

    EXPECTED OUTPUT:
    5
     */

    public static int countOdds(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(element % 2 != 0) count++;
        }
        return count;
    }


    /*
    METHOD-6 countSpecificElement
    Write a method that takes an int array and an int number as arguments and returns the total occurrences of given specific number in the array as an int

    TEST DATA:
    [7, -3, -7, 0, 2, 0, 7, 10, 2, 1], 7

    EXPECTED OUTPUT:
    2
     */

    public static int countSpecificElement(int[] arr, int number) {
        int count = 0;
        for (int element : arr) {
            if(element == number) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println("\n---------Testing countPositives method---------\n");
        System.out.println(countPositives(new int[]{})); // 0
        System.out.println(countPositives(new int[]{-1, -5, 0})); // 0
        System.out.println(countPositives(new int[]{7, -3, -7, 0, 2, 0, 7, 10, 2, 1})); // 6

        System.out.println("\n---------Testing countNegatives method---------\n");
        System.out.println(countNegatives(new int[]{})); // 0
        System.out.println(countNegatives(new int[]{1, 5, 0})); // 0
        System.out.println(countNegatives(new int[]{7, -3, -7, 0, 2, 0, 7, 10, 2, 1})); // 2

        System.out.println("\n---------Testing countZeros method---------\n");
        System.out.println(countZeros(new int[]{})); // 0
        System.out.println(countZeros(new int[]{1, -1})); // 0
        System.out.println(countZeros(new int[]{7, -3, -7, 0, 2, 0, 7, 10, 2, 1})); // 2

        System.out.println("\n---------Testing countEvens method---------\n");
        System.out.println(countEvens(new int[]{})); // 0
        System.out.println(countEvens(new int[]{1, 3, -1, -3})); // 0
        System.out.println(countEvens(new int[]{7, -3, -7, 0, 2, 0, 7, 10, 2, 1})); // 5

        System.out.println("\n---------Testing countOdds method---------\n");
        System.out.println(countOdds(new int[]{})); // 0
        System.out.println(countOdds(new int[]{-4, -2, 0, 2, 4})); // 0
        System.out.println(countOdds(new int[]{7, -3, -7, 0, 2, 0, 7, 10, 2, 1})); // 5

        System.out.println("\n---------Testing countSpecificElement method---------\n");
        System.out.println(countSpecificElement(new int[]{}, 7)); // 0
        System.out.println(countSpecificElement(new int[]{-4, -2, 0, 2, 4}, 7)); // 0
        System.out.println(countSpecificElement(new int[]{7, -3, -7, 0, 2, 0, 7, 10, 2, 1}, 7)); // 2
    }
}
