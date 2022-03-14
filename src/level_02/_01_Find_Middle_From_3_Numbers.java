package level_02;

public class _01_Find_Middle_From_3_Numbers {
    /*
    Write a method that takes 3 int arguments and returns the middle number
    NOTE: 2 or 3 numbers being same is okay

    TEST DATA:
    3, 4, 5

    EXPECTED OUTPUT:
    4
     */

    public static int findMiddleOf3Numbers(int a, int b, int c){
        if(a == b || b == c) return b;
        else if(a == c) return a;

        int greatest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));

        if(a != greatest && a != smallest) return a;
        else if(b != greatest && b != smallest) return b;
        return c;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(findMiddleOf3Numbers(4, 4, 4)); // 4
        System.out.println(findMiddleOf3Numbers(4, 4, 5)); // 4
        System.out.println(findMiddleOf3Numbers(5, 4, 4)); // 4
        System.out.println(findMiddleOf3Numbers(4, 5, 4)); // 4
        System.out.println(findMiddleOf3Numbers(3, 4, 5)); // 4
        System.out.println(findMiddleOf3Numbers(5, 4, 3)); // 4
    }
}
