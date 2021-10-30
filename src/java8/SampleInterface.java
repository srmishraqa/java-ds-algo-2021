package java8;

public interface SampleInterface {

    default public void test(){
        System.out.println("default method in an ineterface");
    }
    static public void staticMethod(){
        System.out.println("static method in an interface");
    }

    public static void main(String[] args) {
        staticMethod();

    }
}
