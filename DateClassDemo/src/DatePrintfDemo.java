import java.util.Date;
public class DatePrintfDemo {
	
	public static void main(String args[]) {
		// Instantiate a Date object
		Date date = new Date();
		
		// display time and date using toString()
		String str = String.format("Current Date/Time : %tc", date );
		System.out.printf(str);
		
		//index must immediately follow the % and it must be terminated by a $.
		System.out.printf("\n %1$s %2$tB %2$td, %2$tY", "Due date:", date);
		
		// display flag formatted date
		System.out.printf("\n %s %tB %<te, %<tY", "Due date:", date);
	}
}