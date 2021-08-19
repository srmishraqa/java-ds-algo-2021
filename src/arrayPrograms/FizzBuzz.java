package arrayPrograms;

/**
 * If Divisible by 3 then print fizz ,If Divisible by 5 then print buzz , If
 * Divisible by 3 and 5 both then we need do print fizzBuzz, if none then print
 * the number and range is 1-100
 */

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("fizzBuzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("fizz" + " ");
            } else if (i % 5 == 0) {
                System.out.print("buzz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }

    }

}
