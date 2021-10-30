package StringProgs;

public class FindSumOfIntegersTillSingleDigit {

    public static int findSingleDigitSum(int num) {
        int sum = 0;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 123456;
        System.out.println(findSingleDigitSum(a));

    }
}
