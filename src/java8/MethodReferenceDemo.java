package java8;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // So here we are passing method implementation to one abstract method present in Functional Interface
        // This will provide re usability
        FunctionalInterfaceDemo fid = Test :: testImplementation;
        fid.abstractMethod();
    }
}

class Test{
    public static  void testImplementation(){
        System.out.println("Test Implementation inside Test Class");
    }
}
