package arrayPrograms;

import java.util.Arrays;

/*
        * Input: arr = [88, 14, 69, 30, 29, 89]
        Output: 1 2 2 3 4 1
        Explanation:
        First 88 arrives, so its rank is 1.
        when 14 arrives, 14 is less than 88 so its rank is 2.
        when 69 arrives, 69 is less than 88 and greater than 14 so its rank is 2.
        when 30 arrives, 30 is less than 88 and 69 so its rank is 3.
        when 29 arrives, 29 is less than 88, 69, 30 than 29 so its rank is 4.
        when 89 arrives, 89 is greater than all values so its rank is 1.
        The rank of elements of array 1 2 2 3 4 1

        Input: arr = [100, 110, 80, 85, 88, 89]
        Output: 1 1 3 3 3 3
        Explanation:
        First 100 arrive so its rank is 1.
        when 110 arrive, 110 is greater than 100 so its rank is 1.
        when 80 arrive, 80 is less than 110 and 100 so its rank is 3.
        when 85 arrive, 85 is less than 110 and 100 so its rank is 3.
        when 88 arrive, 88 is less than 110 and 100 so its rank is 3.
        when 89 arrive, 89 is less than 110 and 100 so its rank is 3.
        The rank of elements of array 1 1 3 3 3 3
        */
public class GiveAnOutputRankedArrayBasedOnNumbers {

    public static int[] rankConverterArrayMethod(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < i; j++) {
                if ( arr[j]>arr[i]) {
                    rank++;

                }
            }
            temp[i] = rank;
        }
        return temp;
    }

    public static void main(String[] args) {
       int[] testArray = {100, 110, 80, 85, 88, 89};
        System.out.println(Arrays.toString(rankConverterArrayMethod(testArray)));
    }

}
