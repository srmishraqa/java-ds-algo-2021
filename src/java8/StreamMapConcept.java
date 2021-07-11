package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * If we want to perform something on every object of the collections then we use map()
 * Imagine we have a list and we want to in crease everything by 8
 * then we can achieve that by map
 * Every object we perform operations and generate each object as new with condition
 */
public class StreamMapConcept {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println("--------------------------");
        System.out.println(list);
        System.out.println("--------------------------");

        //using map()
        List<Integer> updatedMarks = list.stream().map(i -> i + 8).collect(Collectors.toList());
        System.out.println(updatedMarks);
    }

}
