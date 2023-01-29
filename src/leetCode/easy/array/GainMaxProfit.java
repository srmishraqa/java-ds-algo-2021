package leetCode.easy.array;


public class GainMaxProfit {

    // You can buy only once and sell once in the whole array
    public static int bForceBuyOnceSellOnce(int[] arr) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > maxProfit) {
                    maxProfit = arr[j] - arr[i];
                }
            }
        }
        return maxProfit;
    }

    // You can buy only once and sell once in the whole array

    public static int optimizeBuyOnceSellOnce(int[] arr) {
        int maxProfit = 0;
        int minSoFar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minSoFar);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 5, 3, 6, 4};
        System.out.println("max Profit for buy once and sell once : " + bForceBuyOnceSellOnce(arr));
        System.out.println("max Profit for buy once and sell once : " + optimizeBuyOnceSellOnce(arr));
        System.out.println("max Profit for buy once and sell once : " + optimizeBuyOnceSellMultipleTimes(arr));
        System.out.println(Thread.activeCount());
    }

    // You can buy and sell multiple times in the whole array
    public static int optimizeBuyOnceSellMultipleTimes(int[] arr) {
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                maxProfit += (arr[i] - arr[i - 1]);
            }
        }
        return maxProfit;
    }
}
