package walmart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateElementsInAString {
    public static void main(String[] args) {
        String str = "badsahas";
        //method1(str);
        method2(str);
        method3(str);
    }

    // Not Optimized
    public static void method1(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(j));
                }
            }
        }
    }

    //optimized
    public static void method2(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

    }

    // 1st Non Repeated Character
    public static void method3(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }

}
