package amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static int arraySum(int[] arr, int e) {
        int sum = 0;
        for (int i = 0; i <= e; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] returnSubarray(int[] arr, int sum) {
        int[] op = new int[2];
        int sumSoFar = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sum) {
                op[0] = i;
                op[1] = i;
            }
            sumSoFar = arraySum(arr, i);

            if (map.containsKey(sumSoFar - sum)) {
                op[0] = map.get(sumSoFar - sum) + 1;
                op[1] = i;
                break;
            } else {
                op[0] = -1;
                op[1] = -1;
            }

            map.put(sumSoFar, i);

        }
        System.out.println(Arrays.toString(op));
        return op;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -18, 4, 5, 6, 7};
        Arrays.toString(returnSubarray(arr, 5));
        System.out.println(balancedBracket("{{{((()))}}}]"));
        System.out.println(System.currentTimeMillis());
    }

    public static boolean balancedBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ele = str.charAt(i);
            if (ele == '{' || ele == '(' || ele == '[') {
                stack.push(ele);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }

            if (ele == '}') {
                char temp = stack.pop();
                if (temp == '[' || temp == '(') {
                    return false;

                }
            }

            if (ele == ']') {
                char temp = stack.pop();
                if (temp == '(' || temp == '(') {
                    return false;

                }
            }

            if (ele == ')') {
                char temp = stack.pop();
                if (temp == '[' || temp == '{') {
                    return false;

                }
            }
        }

        return stack.isEmpty();

    }

}
