//package StringProgs;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeSet;
//
//public class KthMostFrequentCharacter {
//    public static void main(String[] args) {
//        String str = "GeeksforGeeks";
//        System.out.println(kthMostFrequentChar(str, 3));
//    }
//
//    public static char kthMostFrequentChar(String str, int i) {
//        char op = ' ';
//        char[] temp = str.toLowerCase().toCharArray();
//        HashMap<Character, Integer> hMap = new HashMap<>();
//        int j = 0;
//        while (j < temp.length) {
//            if (!hMap.containsKey(temp[i])) {
//                hMap.put(temp[i], 1);
//
//            } else {
//                hMap.put(temp[i], hMap.get(temp[i]) + 1);
//
//            }
//            j++;
//        }
//
//        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
//        for (Map.Entry<Character, Integer> entry : hMap.entrySet()) {
//            tset.add(entry.getValue());
//        }
//        Integer[] temp2 = tset.toArray(new Integer[tset.size()]);
//
//        if (i <= temp2.length - 1) {
//            op = hMap.get(temp2[i - 1]);
//        }
//    } else
//
//    {
//        op = ' ';
//    }op
//
//        return op;
//}
//}
//
