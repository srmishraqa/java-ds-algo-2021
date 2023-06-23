package leetCode.easy.array;

import java.util.*;

public class sortByFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};

        System.out.println(Arrays.toString(sortByFreqDescending(arr)));
    }

    static Object[] sortByFreqDescending(int[] arr) {
        List<Integer> list= new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }
        System.out.println(map);

        map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).forEach(record -> {
            int key = record.getKey();
            int value = record.getValue();
            for (int j = 0; j < value; j++) {
                list.add(key);
            }
        });

        return list.toArray();
    }
}
