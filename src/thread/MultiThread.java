package thread;

/**
 * Multi threading - It is the concept of executing multiple threads
 * simultaneously Helps max utilization of CPU Threads are independent and don't
 * affect execution of each other If one thread execution encounters some
 * exception , it does not interrupt other threads
 */

public class MultiThread {
    public static void main(String[] args) {
        MyMultiThread firstThread = new MyMultiThread();
        MyRunnable runnable = new MyRunnable();
        Thread secondThread = new Thread(runnable);

        firstThread.start();
        // join() - the other thread will join after specified seconds
        // If we don't specify any time then the other thread will start after this
        // thread dies
        try {
            firstThread.join(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        secondThread.start();
        // This will give exception for main thread but the other two threads will run
        // without any interruption
        // System.out.println(1 / 0);

        /**
         * If we set any thread as daemon thread then JVM does not care about It will
         * terminate the execution as long as all the user threads are completed
         * 
         */
    }
}
