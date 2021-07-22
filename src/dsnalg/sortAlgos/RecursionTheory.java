package dsnalg.sortAlgos;

public class RecursionTheory {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(factorialIterative(5));
    }

    /*

    1! = 0!* 1 ->1
    2! = 1!*2 -> 2
    3! = 2!*3 -> 6

    n! = (n-1)!*n;

     */

    // Method to Find Factorial In a recursive way with breaking condition
    public static int factorialRecursive(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialRecursive(num - 1);

    }

    //Method to find factorial in a iterative way
    public static int factorialIterative(int num) {
        if (num == 0) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }

    }
}
