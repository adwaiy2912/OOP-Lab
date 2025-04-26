import java.util.*;
public class TimeElapse {
		public static void main(String args[]) {
			try {
				long start = System.currentTimeMillis( );
				System.out.println(new Date( ) + "\n");
				Thread.sleep(5*60*10);  //3 seconds
				System.out.println(new Date( ) + "\n");
				long end = System.currentTimeMillis( );  //current time 
				long diff = end - start;
				System.out.println("Difference is : " + diff +" miliseconds");
			} catch (Exception e) {
				System.out.println("Got an exception!");
			}
		}
}