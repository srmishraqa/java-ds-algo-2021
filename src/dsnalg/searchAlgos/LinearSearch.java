package dsnalg.searchAlgos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, -9, -89, 456, 29};
        System.out.println(linearSearch(arr, 29));
        System.out.println(linearSearch(arr, 1));
    }

    public static int linearSearch(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
