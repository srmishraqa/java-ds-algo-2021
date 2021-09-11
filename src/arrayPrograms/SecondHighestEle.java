package arrayPrograms;

public class SecondHighestEle {

    public static int driver(int[] arr) {
        int max = arr[0];
        int max2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max2 < arr[i] && max > arr[i]) {
                max2 = arr[i];
            } else if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            }
        }

        return max2;

    }

    public static void main(String[] args) {
        int[] arr = { 2, -9, 8, 5, 6, 4, -1, 10 };
        System.out.println(driver(arr));
        System.out.println(driver2(arr));
    }

    public static int driver2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }

        return arr[arr.length - 2];

    }

}
