package StringProgs;

import java.util.Scanner;

public class OPentext {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input String :");
        String input = sc.nextLine();
        test(input);

    }

    public static void PrintCountOfLettersHavingVowelOnBothSides(String str) {
        int tempCount = 0;
        String op = " ";
        char[] temp = str.toCharArray();
        for (int i = 1; i < temp.length - 1; i++) {
            if ((temp[i - 1] == 'a' || temp[i - 1] == 'e' || temp[i - 1] == 'i' || temp[i - 1] == 'o' || temp[i - 1] == 'u')
                    && (temp[i + 1] == 'a' || temp[i + 1] == 'e' || temp[i + 1] == 'i' || temp[i + 1] == 'o' || temp[i + 1] == 'u')
            ) {
                tempCount = tempCount + 1;
            }
        }
        if (tempCount > 0) {
            op = str + "(" + tempCount + ")";
            System.out.println(op);
        }

    }

    public static void test(String s){
        String strArray[] = s.split(" \\s");
        for(int i=0;i<strArray.length;i++){
            PrintCountOfLettersHavingVowelOnBothSides(strArray[i]);
        }
    }
}
