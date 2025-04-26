/*
 * Often it is difficult to tell how long a thread can run, in previous we had given 10 sec for
 * main thread which was more than other child threads sleep time.
 * So issue is: How can one thread know when another thread has ended?
 * Two ways exist to determine whether a thread has finished.
 * 				(a) isAlive() - returns boolean value
 * 				(b) join() -  throws InterruptedExceptions
 */

public class JoinAliveThreads extends Thread{
    public static void main(String[] args) {
        Thread t = new Thread();
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            System.out.println(ob1.t.getName() + " join finished");
            ob2.t.join();
            System.out.println(ob2.t.getName() + " join finished");
            ob3.t.join();
            System.out.println(ob3.t.getName() + " join finished");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive: " + ob1.t.isAlive());			//boolean value
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}

//output
//New thread: Thread[One,5,main]			[thread_name, No_of_child, parents_thread]
//New thread: Thread[Two,5,main]
//New thread: Thread[Three,5,main]
//Thread One is alive: true
//Thread Two is alive: true
//Thread Three is alive: true
//Waiting for threads to finish.
//One: 5
//Two: 5
//Three: 5
//One: 4
//Two: 4
//Three: 4
//One: 3
//Two: 3
//Three: 3
//One: 2
//Two: 2
//Three: 2