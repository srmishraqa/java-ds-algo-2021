package java8;

public class TestObject {
    int id;
    String name;

    public TestObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        TestObject t1 = new TestObject(10, "abcd");
        TestObject t2 = new TestObject(10, "abcd");
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        System.out.println("______________________");
        t1 = t2;
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));

        // equals() is a method and == is an operator
        /**
         * We can use == operators for reference comparison (address comparison) and
         * .equals() method for content comparison.
         * In simple words, == checks if both objects point to the same memory location
         * whereas .equals() evaluates to the comparison of values in the objects.
         */
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLO");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

        /**
         * Both s1 and s2 refer to different objects.
         * When we use the == operator for s1 and s2 comparison
         * then the result is true as both have the same addresses in the string constant pool.
         * Using equals, the result is true because it’s only comparing the values given in s1 and s2.
         * Here s1 == s3 giving false as s3 created in heap memory where as s1 and s2 are pointing to String constant pools
         * s3 = “HELLO”
         */


    }
}
