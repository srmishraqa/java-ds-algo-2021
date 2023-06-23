package prog2023.easyToMedium;

/*
Smallest prime divisor of a number
Input: 25
Output: 5
----------
Input: 31
Output: 31
* */

public class SmallestPrimeDivisor {
    public static void main(String[] args) {
        System.out.println(driver(31));
    }

    private static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int driver(int n) {

        if (n % 2 == 0) {
            return 2;
        }
        for (int i = 3; i <= n; i = i + 2) {
            if (n % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return n;
    }
}
