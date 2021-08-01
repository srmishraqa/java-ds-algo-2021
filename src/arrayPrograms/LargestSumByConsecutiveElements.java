package arrayPrograms;

public class LargestSumByConsecutiveElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -7, 4, -12, 5, -1, 6};
        int a = test(arr1);
        System.out.println(a);
    }

    public static int test(int[] arr) {
        int max_so_far = 0;
        int curr_max = Integer.MIN_VALUE;
        for (int i : arr) {
            max_so_far += i;
            if (max_so_far < 0) max_so_far = 0;
            if (max_so_far > curr_max) curr_max = max_so_far;
        }
        return curr_max;
    }
}
