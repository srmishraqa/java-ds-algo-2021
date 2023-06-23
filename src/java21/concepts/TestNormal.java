package java21.concepts;

public class TestNormal extends TestAbstract{

//    @Override
//    public void tellMe() {
//        System.out.println("Tell Me in Test Normal Class");
//    }

    public static void main(String[] args) {
        TestAbstract ta =  new TestNormal();
        ta.doDuty();

    }

}
