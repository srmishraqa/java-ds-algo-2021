package StringProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRighsideCharctersMAtching {

    public static void main(String[] args) {

        String str2 = "aaabAbaAbb";
        System.out.println(isMatching(str2));

    }

    public static boolean isMatching(String str) {
        boolean flag = true;
        int size = str.length();
        char[] arr = str.toCharArray();
        char[] temp;
        List<Character> list = new ArrayList<Character>();
        if (size % 2 == 0) {
            temp = new char[size / 2];
            for (int i = 0; i < size / 2; i++) {
                temp[i] = arr[i];
            }
            for(char element:temp){
                list.add(element);
            }
            for (int j = size / 2; j < arr.length; j++) {
                if (!list.contains(arr[j])) {
                    flag = false;
                    break;
                }
            }
        } else {
            temp = new char[(size / 2) + 1];
            for (int i = 0; i < (size / 2)+1; i++) {
                temp[i] = arr[i];
            }
            for(char element:temp){
                list.add(element);
            }
            for (int j = size / 2; j < arr.length; j++) {
                if (!list.contains(arr[j])) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }


}

