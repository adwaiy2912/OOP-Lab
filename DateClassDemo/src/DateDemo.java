import java.util.Date;

public class DateDemo {
	public static void main(String args[]) {
		// Instantiate a Date object
		Date date = new Date(); 
		
		// display time and date using toString()
		System.out.println(date.toString());
		
		// Display number of milliseconds since midnight, January 1, 1970 GMT
		long msec = date.getTime();
		System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
	}
}