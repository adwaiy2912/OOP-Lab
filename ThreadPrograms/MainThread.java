public class MainThread {
    public static void main(String[] args) {		//main thread
        Thread t = Thread.currentThread();		//method inside Thread class
        										//this reference is stored in the local variable t. 
        System.out.println("Current thread: " + t);

        t.setName("My Thread");			//change the internal name of the thread
        System.out.println("After name change: " + t);
        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);				//specifies the delay period in milliseconds.
                
            }
        }catch (InterruptedException e) {    //This would happen if some other thread 
        									//wanted to interrupt this sleeping one.
            System.out.println("Main thread interrupted");
        }
    }
}
