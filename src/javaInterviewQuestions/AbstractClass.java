package javaInterviewQuestions;

public abstract class AbstractClass implements SampleInterface{

    public abstract void start();

    public abstract void end();

    public void test() {
        System.out.println("Test in Abstract class");
    }

    @Override
    public void sampleInterfaceEnd() {
        System.out.println("Sample Interface End Implemented in Abstract class");
    }
}
