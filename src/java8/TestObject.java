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
    }
}
