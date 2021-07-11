package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] arr = {"java", "python", "Ruby", "perl", "java", "python"};

        //1
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate is : " + arr[i]);
                }
            }
        }



        //2
        System.out.println("###############");
        Set<String> set = new HashSet<String>();
        for (String names : arr) {
            if (set.add(names) == false) {
                System.out.println("Duplicate is : " + names);
            }
        }

        // hashmap
    }
}
