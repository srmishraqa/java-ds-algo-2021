package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collections and Stream Difference :
 * If we want to represent a group of objects as a single entity then we should use collections
 * If we want to process objects from the collections then we should go for Stream
 * <p>
 * stream() - required to use
 * Stream stm = collection.stream();
 * Stream is an interface present in java.util.stream
 * Stream is always can be used on top of any Collections
 * Biggest advantage of Stream - Less lines of code is required
 */
public class StreamFilterConcept {
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
        /**
         * the requirement is form this collection here it is list I have to select only even numbers
         * First get the stream method for this collection
         * then we have to call filter() with the condition
         * .stream().filter().collect(Collectors.toList())
         *
         */
       // Stream stream = list.stream();

        List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("--------------------------");
        System.out.println(list2);
        System.out.println("--------------------------");

    }

}
