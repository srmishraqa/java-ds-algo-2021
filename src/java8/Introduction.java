package java8;

import java.util.function.BiConsumer;

public class Introduction {
    /*
     * 1. Java 8 came into picture for conciseness of code
     * 2. Java 8 brought feature like functional programming along with Object Oriented Programming
     *    By introducing Lambda Expression
     * 3. New Features introduced in java8
     * -> Lambda Expression -> Stream API (map,filter)
     * -> Default methods in Interface -> static methods
     * -> Functional Interface -> optional class
     * -> Method References -> Date API
     */

    /**
     * Lambda expression -> anonymous function without name , return type , access modifier and have symbol '->'
     */
    // Normal function
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        // Normal Execution - Create a Object of this class and then call non static method

        //Introduction introduction = new Introduction();
        //introduction.add(10,5);

        // After Java 8 - we don't need to define that non-static method , again create object and then call that method
        // We can do all the above 3 things in lambda expression

        /*
         * The lambda expression assigned to an object of BiConsumer type is used to define its accept()
         * which eventually applies the given operation on its arguments.
         * BiConsumers are useful when it is not required to return any value
         * as they are expected to operate via side-effects.
         */


        BiConsumer<Integer, Integer> biConsumer = ( a,  b) -> System.out.println(a + b);
        biConsumer.accept(10,5);

        /*
         * BiConsumer is a functional Interface
         * Lambda expression is referenced by Functional Interfaces
         */

    }

}
