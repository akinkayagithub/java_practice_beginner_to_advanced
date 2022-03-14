package level_01;

public class _01_Find_Sum_Product_Subtraction_Division_Remainder_Of_2_Numbers {
    /*
    METHOD-1 -> findSumOf2Numbers
    Write a method that takes 2 int arguments and returns their sum

    TEST DATA:
    12, 5

    EXPECTED OUTPUT:
    17
     */

    public static int findSumOf2Numbers(int a, int b){
        return a + b;
    }


    /*
    METHOD-2 -> findProductOf2Numbers
    Write a method that takes 2 int arguments and returns their product

    TEST DATA:
    12, 5

    EXPECTED OUTPUT:
    60
     */

    public static int findProductOf2Numbers(int a, int b){
        return a * b;
    }


    /*
    METHOD-3 -> findSubtractionOf2Numbers
    Write a method that takes 2 int arguments and returns their subtraction

    TEST DATA:
    12, 5

    EXPECTED OUTPUT:
    7
     */

    public static int findSubtractionOf2Numbers(int a, int b){
        return a - b;
    }


    /*
    METHOD-4 -> findDivisionOf2Numbers
    Write a method that takes 2 int arguments and returns their division

    TEST DATA:
    12, 5

    EXPECTED OUTPUT:
    2
     */

    public static int findDivisionOf2Numbers(int a, int b){
        return a / b;
    }


    /*
    METHOD-4 -> findRemainderOf2Numbers
    Write a method that takes 2 int arguments and returns their remainder

    TEST DATA:
    12, 5

    EXPECTED OUTPUT:
    2
     */

    public static int findRemainderOf2Numbers(int a, int b){
        return a % b;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(findSumOf2Numbers(12, 5)); // 17
        System.out.println(findProductOf2Numbers(12, 5)); // 60
        System.out.println(findSubtractionOf2Numbers(12, 5)); // 7
        System.out.println(findDivisionOf2Numbers(12, 5)); // 2
        System.out.println(findRemainderOf2Numbers(12, 5)); // 2
    }
}
