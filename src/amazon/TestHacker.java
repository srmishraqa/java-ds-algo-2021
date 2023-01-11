package amazon;

public final class TestHacker {
    class  Inner{
        void test(){
            if(TestHacker.this.flag){
                sample();
            }
        }
    }
    private boolean flag = true;
    public void sample(){
        System.out.println("Sample");
    }
    public TestHacker(){
        (new Inner()).test();
    }

    public static void main(String[] args) {
        new TestHacker();
    }

}

