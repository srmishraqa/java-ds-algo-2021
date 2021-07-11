package arrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;

public class SortAccordingToFrequency {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 5, 8, 1, 1, 5};
        System.out.println(sortAcToFrequency(array));
    }

    public static List<Integer> sortAcToFrequency(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        while (i < arr.length) {
            if (!linkedHashMap.containsKey(arr[i])) {
                linkedHashMap.put(arr[i], 1);
            } else {
                linkedHashMap.put(arr[i], linkedHashMap.get(arr[i]) + 1);
            }
            i++;
        }
        // sort map by value;
        linkedHashMap.entrySet().stream().sorted(Map.Entry.< Integer, Integer > comparingByValue().reversed()).forEach(record -> {
            int key = record.getKey();
            int value = record.getValue();
            for (int j = 0; j < value; j++) {
                list.add(key);
            }
        });
        return list;
    }
}
