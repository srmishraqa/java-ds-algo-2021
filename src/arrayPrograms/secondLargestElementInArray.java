package arrayPrograms;

public class secondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {47, 22, 1, -1, 34, 44, 34, 69, 45};
        System.out.println(secondMaximum(arr));

    }

    public static int secondMaximum(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                return arr[1];
            } else {
                return arr[0];
            }
        }

        int max = 0;
        int mx2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] < max) && (arr[j] > mx2)) {
                mx2 = arr[j];
            }
        }
        return mx2;
    }
}
