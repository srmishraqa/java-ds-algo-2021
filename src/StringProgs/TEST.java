package StringProgs;

//import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST {
    public static void main(String[] args) {
        char[] a1 = {'a', 'b', 'A', 'a', 'b'};
        System.out.println(compare(a1));
    }

    public static boolean compare(char[] arr) {
        boolean flag = true;
        int size = arr.length;

        char[] temp = new char[(size / 2) + 1];
        for (int i = 0; i < (size / 2) + 1; i++) {
            temp[i] = arr[i];
        }
        List<Character> list = new ArrayList<>();
        for(char element:temp){
            list.add(element);
        }
        for (int j = size / 2; j < arr.length; j++) {
            if (!list.contains(arr[j])) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}


