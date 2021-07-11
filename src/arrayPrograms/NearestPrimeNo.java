package arrayPrograms;

import java.util.Scanner;

public class NearestPrimeNo {
    public static boolean isPrime(int a) {
        int c = 0;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                c = 1;
            }
        }

        if (c == 1)
            return false;
        else
            return true;


    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        int n, n1, d, d1;
        for (i = a + 1; ; i++) {
            if (isPrime(i)) {
                n = i;
                d = i - a;

                break;
            }
        }
        for (i = a - 1; ; i--) {
            if (isPrime(i)) {
                d1 = a - i;
                n1 = i;

                break;
            }
        }
        if (d > d1)
            System.out.println("closest prime no.: " + n1);
        else if (d1 > d)
            System.out.println("closest prime no.: " + n);
        else
            System.out.println("closest prime no.: " + n + " " + n1);
    }

}
