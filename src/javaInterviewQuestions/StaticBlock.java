package javaInterviewQuestions;

import java.util.Arrays;

public class StaticBlock {

    static {
        System.out.println("Static block Ready");
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Main Method");
    }
}
