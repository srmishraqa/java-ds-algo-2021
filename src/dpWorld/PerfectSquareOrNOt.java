package dpWorld;

import java.util.*;

public class PerfectSquareOrNOt {

    public static void main(String[] args) {
        int a = 26;
        System.out.println(driver(a));
    }

    public static int driver(int num) {
        int output = 0;
        int minDist = num;
        int temp = 0;
//       Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= num / 2; i++) {
            if (i * i == num) {
                output = i;
            } else {
                temp = i * i - num;
                if (temp > 0) {
                    if (temp < minDist)
                        minDist = temp;

                } else if (temp < 0) {
                    if (temp * -1 < minDist) {
                        minDist = temp * -1;

                    }
                }
            }
        }

        return output;
    }

//    public static int getMinRooms(List<List<Integer>> meetingTimings) {
//        Arrays.sort(meetingTimings, (a, b) -> a[0] - b[0]);
//        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
//        int numRooms = 0;
//        for (List<Integer> meeting : meetingTimings) {
//            if (!endTimes.isEmpty() && meeting.get(0) >= endTimes.peek()) {
//                endTimes.poll();
//            } else {
//                numRooms++;
//            }
//            endTimes.offer(meeting.get(1));
//        }
//        return numRooms;
//    }
}
