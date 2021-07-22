package test;

public class AverageAndFactorial {

    public static int factorial(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int calculateAverage(int[] arr) {
        int sum = 0;
        int avg;
        for (int element : arr) {
            sum += element;
        }
        avg = sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 10, 17, 15, 14};
        int avg = calculateAverage(arr);
        System.out.println("Average is : " + avg);

        int factorial = factorial(5);
        System.out.println("Factorial is : " + factorial);
    }
}
