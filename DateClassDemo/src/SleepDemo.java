
//following program would sleep for 10 seconds

import java.util.*;
public class SleepDemo {
		public static void main(String args[]) {
			try {
				System.out.println(new Date( ));
				System.out.println("wait for few seconds....");
				Thread.sleep(10000);			//miliseconds
				System.out.println("Welcome back after 10 seconds!");
				System.out.println(new Date( ) + "\n");		
			} catch (Exception e) {
				System.out.println("Got an exception!");
			}
		}
}