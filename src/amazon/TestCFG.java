package amazon;

public class TestCFG {

    public static void printArray(int[] array) {
        for (int i : array)
            System.out.println(i);
    }

    public static void main(String args[]) {
        int[] array = new int[10];
        printArray(array);
    }
}
