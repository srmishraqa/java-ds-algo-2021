package amazon;

public class PrintNumbersWithoutUsingLoop {
    public static void main(String[] args) {
        // printNumbers(100);
        printOnlyEvenNumbers(105);
    }

    /**
     * Print Numbers from 1 to number where number acts as ending param
     * if let's say we call by providing param as 100 then it will print from 1,2,3,...100
     *
     * @param number
     */
    public static void printNumbers(int number) {
        if (number > 0) {
            printNumbers(number - 1);
            System.out.print(number + " ");
        }
    }

    /**
     * Print only even Numbers from 1 to number where number acts as ending param
     * if let's say we call by providing param as 100 then it will print from 2,4,6,...100
     *
     * @param number
     */
    public static void printOnlyEvenNumbers(int number) {
        if (number % 2 == 0) {
            if (number > 0) {
                printOnlyEvenNumbers(number - 2);
                System.out.print(number + " ");
            }
        } else if (number % 2 == 1) {
            number = number - 1;
            if (number > 0) {
                printOnlyEvenNumbers(number - 2);
                System.out.print(number + " ");
            }
        }
    }
}
