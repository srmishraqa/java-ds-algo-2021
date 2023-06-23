package leetCode.medium.string;

import java.util.ArrayList;
import java.util.List;

import leetCode.easy.array.sortByFrequency;

/*
Generate Combination
 * Input: n=1
Output: {}
Explanation: This the only sequence of balanced 
parenthesis formed using 1 pair of balanced parenthesis. 

Input : n=2
Output: 
{}{}
{{}}
 */

public class GenerateParenthesis {

    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    // We have 3 conditions here
    // 1st condition is we need have 3 open and 3 closed parenthesis
    // 2nd is to add open parenthesis till open < 3 (desired length)
    // 3rd condition if close < Open , then only add a close one

    private static void backTrack(List<String> result, int open, int close, int n, String str) {

        if (str.length() == 2 * n) {
            result.add(str);
        }

        if (open < n) {
            backTrack(result, open + 1, close, n, str + "{");
        }

        if (close < open) {
            backTrack(result, open, close + 1, n, str + "}");
        }
    }

    public static List<String> generateParenthesis(int n) {
        backTrack(result, 0, 0, 3, "");
        return result;
    }

}
