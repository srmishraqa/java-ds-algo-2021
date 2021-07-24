package javaInterviewQuestions;

public class NormalClass extends AbstractClass {

    @Override
    public void end() {
        System.out.println("end in Normal class");
    }

    @Override
    public void start() {
        System.out.println("start in Normal Class");
    }

    @Override
    public void sampleInterfaceStart() {
        System.out.println("Start implemented in class of Sample Interface");
    }

    public void test() {
        System.out.println("Test in Abstract class is overloaded in Normal class ");
    }

    public static void main(String[] args) {
        System.out.println("Interface Variable is :"+SampleInterface.interfaceVar);
        NormalClass normalClass = new NormalClass();
        normalClass.sampleInterfaceStart();
        normalClass.start();
        normalClass.test();
        normalClass.end();
        normalClass.sampleInterfaceEnd();
    }
}
