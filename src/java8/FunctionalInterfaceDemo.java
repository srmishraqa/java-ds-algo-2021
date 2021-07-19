package java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void abstractMethod();

    default void printName() {
        System.out.println(" Default method PrintName() ");
    }
}
