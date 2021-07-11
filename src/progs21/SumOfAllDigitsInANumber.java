package progs21;

/**
 * Asked by Amazon QA Engineer
 * 89462 should return -> 8+9+4+6+2 = 29
 */
public class SumOfAllDigitsInANumber {

    public static int returnSumOfAllDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 89462;
         number = returnSumOfAllDigits(number);
        System.out.println(number);
    }
}
