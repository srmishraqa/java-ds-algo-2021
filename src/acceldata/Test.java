package acceldata;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static int driver(int[] arr) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() > max) {
                max = integerIntegerEntry.getValue();
            }
        }

        if (max == 1) {
            return 0;
        } else {
            return arr.length - max;
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, -1, 9, -1, -1, 0, 6};
        System.out.println(driver(arr));
    }
}
