package prog2023.interviewProgs;

/*
 * Have the function  MultipleBrackets(str) take the str  parameter being passed
 * and return 1 #ofBrackets if the brackets are correctly matched and each one is accounted for.
 * otherwise return 0.
 * For example: if str is "(hello [world])(!)", then the output should be 1 3
 * because all the brackets are matched and there are 3 pairs of brackets,
 * but if str is "((hello [world])" the the output should be 0
 * because the brackets do not correctly match up. Only "(", ")", "[", and "]" will be used as brackets.
 * If str contains no brackets return 1.*/

import java.util.Stack;

public class calculateParenthesis {

    public static void main(String[] args) {
//        System.out.println(MultipleBrackets("(hello [world])(!)"));  // Output: 1 3
//        System.out.println(MultipleBrackets("((hello [world])"));   // Output: 0
        System.out.println(MultipleBrackets("abc"));                // Output: 1 0
//        System.out.println(MultipleBrackets("[hello]"));

    }

    static String MultipleBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return "0";
                }
                if ((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[')) {
                    stack.pop();
                    count++;
                } else {
                    return "0";
                }
            }
        }

        if (!stack.isEmpty()) {
            return "0";
        }

        return "1 " + count;
    }

}
