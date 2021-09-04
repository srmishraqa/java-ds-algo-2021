package thread;

public class MyMultiThread extends Thread {

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread-1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println("Finished Thread #1 Execution:");
    }

}
