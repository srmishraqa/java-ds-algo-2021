package thread;

/**
 * thread = A thread of execution in a program (kind of like a virtual CPU) The
 * JVM allows an application to have multiple threads running concurrently Each
 * thread can execute parts of you code in parallel with the main thread Each
 * thread has a priority. Threads with higher priority are executed in
 * preference compared to threads with a lower priority
 * <p>
 * The Java Virtual Machine continues to execute threads until either of the
 * following occurs 1. The exit method of class Runtime has been called 2. All
 * user threads have died
 * <p>
 * When a JVM starts up, there is a thread which calls the main method This
 * thread is called “main”
 * <p>
 * Daemon thread is a low priority thread that runs in background to perform
 * tasks such as garbage collection JVM terminates itself when all user threads
 * (non-daemon threads) finish their execution
 */
public class ThreadConcepts {

    public static void main(String[] args) throws InterruptedException {

        // Get active no of threads
        System.out.println(Thread.activeCount());

        // Get the name of the current thread
        System.out.println(Thread.currentThread().getName());

        // Set Name of thread
        Thread.currentThread().setName("Current Thread");
        System.out.println(Thread.currentThread().getName());

        // Get the priority
        System.out.println(Thread.currentThread().getPriority());

        // set the priority
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());

        // Current thread is alive
        System.out.println(Thread.currentThread().isAlive());

        // sleep() - to pause execution thread for a certain period
        for (int j = 3; j > 0; j--) {
            System.out.println(j);
            Thread.sleep(1000);
        }
        System.out.println("You are Done!!");

        MyThread myThread = new MyThread();

        System.out.println(myThread.getName());
        // To start thread and continue it as alive we need to use start()
        // myThread.run();
        myThread.start();
        System.out.println(myThread.isAlive());

        // To check whether thread is a daemon thread or not
        System.out.println(myThread.isDaemon());

    }
}
