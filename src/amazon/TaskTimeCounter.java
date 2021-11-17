package amazon;

import java.util.LinkedList;
import java.util.Queue;

/**
 * QUESTION 1 -
 * <p>
 * A CPU has N tasks to be performed. It is to be noted that the tasks have to be performed
 * in a specific order to avoid deadlock. In every clock cycle the CPU can either perform a
 * task or move it to the back of the queue. You are given the current state of the scheduler
 * queue in array A and the required order of the tasks in array B.
 * <p>
 * Determine the minimum number of clock cycles to complete all the tasks.
 * <p>
 * Return an integer denoting the minimum number of clock cycles required to complete all the tasks.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = [2, 3, 1, 5, 4]
 * B = [1, 3, 5, 4, 2]
 * <p>
 * Output 1:
 * 10
 * <p>
 * <p>
 * Input 2:
 * <p>
 * A = [1]
 * B = [1]
 * <p>
 * Output 2:
 * 1
 */

public class TaskTimeCounter {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 5, 4};
        int[] arr2 = {1, 3, 5, 4, 2};
        System.out.println(findNoOfClockCycles(arr1, arr2));
    }

    public static int findNoOfClockCycles(int[] taskArray, int[] taskSequenceArray) {
        int clockCounter = 0;
        Queue<Integer> taskQueue = new LinkedList<>();
        for (int task : taskArray) {
            taskQueue.add(task);
        }
        System.out.println(taskQueue);
        int ptr = 0;
        while (ptr < taskSequenceArray.length) {
            int temp = taskQueue.remove();
            if (temp == taskSequenceArray[ptr]) {
                ptr++;
            } else {
                taskQueue.add(temp);
            }
            clockCounter++;
        }

        return clockCounter;
    }

}
