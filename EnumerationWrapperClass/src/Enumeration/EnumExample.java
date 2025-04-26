package Enumeration;

public class EnumExample {
	public enum Week{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, 
		SATURDAY,SUNDAY
	}
	
	public static void main(String[] args) {
		for(Week w:Week.values())		// w = Week.Monday, Week.Tuesday....
			System.out.println(w);		//prints all the values of w
		System.out.println("******************************");
		
//      valueOf() method returns the value of given constant enum.		
		System.out.println("Value of WEDNESDAY is: "+Week.valueOf("WEDNESDAY"));
		System.out.println("******************************");
		
//		ordinal() method returns the index of the enum value.
		System.out.println("Index of WEDNESDAY is: "+Week.valueOf("WEDNESDAY").ordinal());  
		System.out.println("Index of SUNDAY is: "+Week.valueOf("SUNDAY").ordinal());  
	}	
}
