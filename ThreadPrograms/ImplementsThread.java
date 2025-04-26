class NewThread1 implements Runnable {
    Thread t;					//Thread reference object  
    NewThread1() {
        t = new Thread(this,"Demo Thread.");
        System.out.println("Child Thread: "+ t);
        t.start();				//Start the thread
    }
    
    /*
     * It is important to understand that run( ) can call other methods, 
     * use other classes, and declare variables, just like the main thread can. 
     * 
     * The only difference is that run( ) establishes the entry point for 
     * another, concurrent thread of execution within your program. This thread 
     * will end when run( ) returns.
     */
    //implement run() not overrides
    public void run() {   			// This is the entry point for the thread.
        try {  //till there is zero threads for a count of 5 the clock executes child thread
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

//observe main thread should be last thread to be executed.
public class ImplementsThread {
    public static void main(String[] args) throws Exception {
        new NewThread1();
        for(int i = 10; i > 0; i--) {			//main thread---10 threads
           System.out.println("Main Thread: " + i);
            Thread.sleep(5000);
        }
    }
}
