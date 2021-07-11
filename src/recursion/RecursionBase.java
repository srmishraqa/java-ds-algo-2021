package recursion;

/**
 * Recursion works on following 3 logics
 * 1. Find the base Case
 * 2. Find the relation between main problem and sub problem
 * 3. Generalize the relationship
 */

// Sum of n natural numbers using recursion

public class RecursionBase {

    public static int returnSumOfNaturalNum(int num) {

        //Base case -> if we want to find sum of 1 natural number -> will be 1 only
        if (num == 1) {
            return 1;
        }

        // sub problem is like sum of n natural numbers is
        // sum of n-1 + n -> We need to apply the same logic here
        // and we generalized this
        return num + returnSumOfNaturalNum(num - 1);
    }

    public static int powerFunction(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return powerFunction(a, b - 1) * a;
    }

    public static int fibonacii(int num) {
        if (num <= 1) return 1;
        return fibonacii(num - 1) + fibonacii(num - 2);

    }


    public static void main(String[] args) {
        System.out.println(returnSumOfNaturalNum(4));
        System.out.println(powerFunction(3, 4));
        System.out.println(fibonacii(6));
    }
}
