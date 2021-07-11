package arrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetADayFromDayAndNumber {

    public static void main(String args[]) {
        System.out.println(getDay("Sat", 23));
        System.out.println(getDay("Wed",2));

    }

    public static String getDay(String day, int k) {
        String days[] = {"Sun", "Mon", "Tue", "Wed",
                "Thu", "Fri", "Sat"};
        Map<String, Integer> hh = new LinkedHashMap<>();
        hh.put("Sun", 0);
        hh.put("Mon", 1);
        hh.put("Tue", 2);
        hh.put("Wed", 3);
        hh.put("Thu", 4);
        hh.put("Fri", 5);
        hh.put("Sat", 6);

        int x = (hh.get(day) + k) % 7;
        return days[x];
    }
}
