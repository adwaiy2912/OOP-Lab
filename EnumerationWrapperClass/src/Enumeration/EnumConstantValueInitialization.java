package Enumeration;

/*
 * The enum constants have an initial value which starts from 0, 1, 2, 3, 
 * and so on. But, we can initialize the specific value to the enum 
 * constants by defining fields and constructors. As specified earlier, 
 * Enum can have fields, constructors, and methods.
 */
public class EnumConstantValueInitialization {
	
	enum Season{   
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);   
		  
		private int value;  
		private Season(int value){  
		this.value=value;  
		}  
	}  
	
		public static void main(String args[]){  
		for (Season s : Season.values())  
		System.out.println(s+" "+s.value);  
	}

}
