package amazon;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromAString {

    public static String removeDuplicates(String str) {
        StringBuilder output = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);
        for(char c : set){
            output.append(c);
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("geeksforgeeks"));
    }
}
