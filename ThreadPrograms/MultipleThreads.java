class NewThread implements Runnable {
    String name; // name of thread
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        t.start(); // Start the thread
    }

    public void run() {
        System.out.println(name + " starting.");
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}
public class MultipleThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
/*			output
 * As you can see, once started, all three child threads share the CPU.
 * Notice the call to sleep(10000) in main( ).
 * This causes the main thread to sleep for ten seconds and ensures that it will finish last.
 * New thread: Thread[One,5,main]
 *
 *
New thread: Thread[One,5,main]				[thread_name, No_of_child, parents_thread]
New thread: Thread[Two,5,main]
New thread: Thread[Three,5,main]
One: 5
Two: 5
Three: 5
One: 4
Two: 4
Three: 4
One: 3
Three: 3
Two: 3
One: 2
Three: 2
Two: 2
One: 1
Three: 1
Two: 1
One exiting.
Two exiting.
Three exiting.
Main thread exiting.
 */

