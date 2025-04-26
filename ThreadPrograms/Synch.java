//To exit the monitor and relinquish control of the object 
//for the next waiting thread, the owner of the monitor simply 
//returns from the synchronized method.
//
// This program is not synchronized.
class Callme {
		void call(String msg) {
			/*
			 * call( ) prints the opening bracket and the msg string, 
			 * it calls Thread.sleep(1000), which pauses the current 
			 * thread for one second.
			 */
			System.out.print("[" + msg);			 
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Interrupted");
			}
			System.out.println("]");
		}
}

class Caller implements Runnable {
		String msg;
		Callme target;
		Thread t;
		public Caller(Callme targ, String s) {		//constructor takes reference of callme class
			target = targ;
			msg = s;
			t = new Thread(this);
			t.start();
		}
		/*
		 * constructor also creates a new thread that will call 
		 * this object’s run( ) method.
		 */
		public void run() {
			target.call(msg);
		}
}

class Synch {
public static void main(String args[]) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");
		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		/*------race condition-------
		 * As you can see, by calling sleep( ), the call( ) method allows execution to 
		 * switch to another thread. This results in the mixed-up output of the three 
		 * message strings. In this program, nothing exists to stop all three threads 
		 * from calling the same method, on the same object, at the same time. 
		 */
	}
}