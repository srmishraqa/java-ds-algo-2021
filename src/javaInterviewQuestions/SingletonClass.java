package javaInterviewQuestions;

public class SingletonClass {

    private static SingletonClass refVar = null;
    public String str;

    // Private Constructor of singleton class
    private SingletonClass() {
        str = "Using Singleton Pattern";
    }

    // public static method returning Singleton class type
    public static SingletonClass getInstance() {
        if (refVar == null) {
            refVar = new SingletonClass();
        }
        return refVar;
    }

    public static void main(String[] args) {
        SingletonClass s1 = new SingletonClass();
        SingletonClass s2 = new SingletonClass();
        System.out.println(s1.str);
        System.out.println(s2.str);
        System.out.println(s1.equals(s2));
    }
}
