package javaInterviewQuestions;

/**
 * It is used to eliminate the option of create more than one object at a time
 * One Object of the class at a time
 * <p>
 * If we try to create another object it will point to same object
 * <p>
 * Make constructor as private
 * Write a public static method that has a return type Object of Singleton class - lazy initialization
 */

public class SingletonPattern {
    // private static variable
    private static SingletonPattern firstInstance = null;
    public String str;

    // private ctc
    private SingletonPattern() {
        str = "Using a singleton design pattern";
    }

    // public static method with return type as singleton class
    public static SingletonPattern getInstance() {
        if (firstInstance == null) {
            firstInstance = new SingletonPattern();

        }
        return firstInstance;
    }

    //testing code
    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();
        SingletonPattern s3 = SingletonPattern.getInstance();

        s1.str = s1.str.toUpperCase();
        System.out.println(s1.str);
        System.out.println(s2.str);;
        System.out.println(s3.str);
    }

}
